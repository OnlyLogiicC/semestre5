from itertools import chain, combinations

PRECISION = 3

def omega_generation() :
    omega_out = []
    n = int(input("Combien d'éléments dans l'univers ? ")) #raw_input en python 2
    for i in range(n) :
        omega_out.append(input("Renseigner le nom du " + str(i+1) + " élément de l'univers : "))
    return omega_out

def powerset_generation(omega) : # Construction du powerset à partir de l'univers Omega
    xs = list(omega)
    output = ['vide']
    tuples = chain.from_iterable(combinations(xs,n) for n in range(len(xs)+1))
    for t in list(tuples)[1:] :
        i = list(t)
        ensemble = ''
        for char in i :
            ensemble += char
        output.append(ensemble)
    return output

def include(P,A) :  # teste p inclus dans A
    if P == 'vide' :
        return True
    if A == 'vide' :
        return False
    for char_p in P :
        present = False
        i = 0
        while (not present) and i<len(A) :
            if char_p == A[i] :
                present = True
            else:
                i+=1
        if not present :
            return False
    return True
    
def intersection(P,A) : # Teste si P et A ont une intersection non vide
    if P == 'vide' or A == 'vide' : # Renvoie False pour l'intersection de deux ensembles vides
        return False
    for char_p in P :
        for char_a in A :
            if char_p == char_a :
                return True
    return False

def ensemble_intersection(P,A) : # Renvoie l'intersection des ensembles P et A
    if P == 'vide' or A == 'vide' : # Renvoie False pour l'intersection de deux ensembles vides
        return 'vide'
    ens_out = ''
    for char_p in P :
        for char_a in A :
            if char_p == char_a :
                ens_out += char_p
    if ens_out == '' :
        return 'vide'
    return ens_out

def ensemble_union(P,A) : # Renvoie l'union des ensembles P et A
    if equals(P,'vide') : return A
    if equals(A,'vide') : return P
    if equals(P,A) : return P
    tmp = A[:]
    for char_p in P :
        present = False
        i = 0
        while not present and i<len(tmp) :
            if char_p == tmp[i] :
                tmp = tmp[:i] + tmp[i+1:]
                present = True
                i -= 1 # Compensation de la suppression du charactère par rapport à la taille de la chaîne tmp
            i += 1
    return P + tmp

def equals(A, B) : # Teste l'égalité entre deux ensembles
    return (include(A,B) and include(B,A))

def complem(A,omega) : # Retourne l'ensemble complémentaire de A
    Acomp = ''
    for p in omega :
        if not include(p,A) :
            Acomp += p
    if Acomp == '' :
        Acomp = 'vide'
    return Acomp

def mass_generation(powerset) :
    mass_out = {}
    for p in powerset :
        mass_out[p] = 0
    n = int(input("Combien de valeurs de mass à ajouter ? ")) #raw_input en python 2
    for i in range(n) :
        A = input(str(i+1) + "**  Entrez le nom de l'ensemble dont vous voulez renseigner la masse : ")
        j = 0
        present = False
        while (not present) and j<len(mass_out) :
            if equals(A,powerset[j]) :
                mass_out[powerset[j]] = float(input("Entrez la valeur de mass : "))
                present = True
                print("Valeur de mass ajoutée avec succès")
            else :
                j += 1
        if (not present) :
            print("Cet ensemble ne fait pas parti du powerset, l'ajout de mass a échoué !")
    return mass_out

def mass_gen_combi(pwrset) : # Fonction qui génère les fonctions de mass m1, m2, .., mN
    L_mass = []
    n = int(input("Combien de fonctions de mass à renseigner ? ")) #raw_input en python 2
    for i in range(n) :
        print("Fonction de mass " + str(i+1) + " : ")
        L_mass.append(mass_generation(pwrset))
    return L_mass

def bel_generation(powerset) : # Fonction qui génère la fonction de Croyance
    bel_out = {}
    for p in powerset :
        bel_out[p] = 0
    n = int(input("Combien de valeurs de Croyance à ajouter ? ")) #raw_input en python 2
    for i in range(n) :
        A = input(str(i+1) + "**  Entrez le nom de l'ensemble dont vous voulez renseigner la Croyance : ")
        j = 0
        present = False
        while (not present) and j<len(bel_out) :
            if equals(A,powerset[j]) :
                bel_out[powerset[j]] = float(input("Entrez la valeur de Croyance : "))
                present = True
                print("Valeur de Croyance ajoutée avec succès")
            else :
                j += 1
        if (not present) :
            print("Cet ensemble ne fait pas parti du powerset, l'ajout de Croyance a échoué !")
    return bel_out

def pl_generation(powerset) : # Fonction qui génère la fonction de Croyance
    pl_out = {}
    for p in powerset :
        pl_out[p] = 0
    n = int(input("Combien de valeurs de Plausibilité à ajouter ? ")) #raw_input en python 2
    for i in range(n) :
        A = input(str(i+1) + "**  Entrez le nom de l'ensemble dont vous voulez renseigner la Plausibilité : ")
        j = 0
        present = False
        while (not present) and j<len(pl_out) :
            if equals(A,powerset[j]) :
                pl_out[powerset[j]] = float(input("Entrez la valeur de Plausibilité : "))
                present = True
                print("Valeur de Plausibilité ajoutée avec succès")
            else :
                j += 1
        if (not present) :
            print("Cet ensemble ne fait pas parti du powerset, l'ajout de Plausibilité a échoué !")
    return pl_out

def bel(pwrset, mass, A) : # Fonction de Croyance de l'ensemble A (Belief)
    b = 0
    for p in pwrset :
        if include(p,A):
            b += mass[p]
    return b

def pl(pwrset, mass, A) : # Fonction de Plausibilité de l'ensemble A (Plausibility)
    output = 0
    for p in pwrset :
        if intersection(p,A) :
            output+= mass[p]
    return output

def bel_to_mass(pwrset, D_bel, A) : # Fonction qui calcule la Mass à partir des Croyances connues
    if A == 'vide' :
        return (1 - D_Bel[pwrset[-1]])
    m_out = 0
    for P in pwrset[1:] :
        if include(P,A) :
            m_out += (-1)**(len(A)-len(P)) * D_Bel[P]
    return m_out

def pl_to_mass(pwrset, D_pl, A) : # Fonction qui calcule la Mass à partir des Plausibilités connues
    if A == 'vide' :
        return (1 - D_pl[pwrset[-1]])
    m_out = 0
    for P in pwrset[1:] :
        if include(P,A) :
            Pcomp = complem(P)
            for e in pwrset :
                if equals(Pcomp,e) : Pcomp = e
            m_out += (-1)**(len(A)-len(P) + 1) * D_pl[Pcomp]
    return m_out

def pl_to_bel(pwrset, D_pl, A) : #Fonction qui calcule la Croyance à partir de la Plausibilité
    D_mass = {}
    for P in pwrset :
        D_mass[P] = pl_to_mass(pwrset, D_pl, P)
    return bel(pwrset, D_mass,A)

def bel_to_pl(pwrset, D_bel, A) : #Fonction qui calcule la Plausibilité à partir de la Croyance
    D_mass = {}
    for P in pwrset :
        D_mass[P] = bel_to_mass(pwrset, D_bel, P)
    return pl(pwrset, D_mass,A)

def degree_of_conflict(pwrset, D_mass1, D_mass2) : # Calcule le degré de conflit entre deux fonctions de Mass
    K = 0
    for e1 in pwrset :
        for e2 in pwrset :
            if (not intersection(e1,e2)) :
                K += D_mass1[e1]*D_mass2[e2]
    return K

def conjonctive_rule(pwrset, D_mass1, D_mass2, A) : # Calcul la valeur de la loi conjonctive pour l'ensemble A
    result = 0
    for e1 in pwrset :
        for e2 in pwrset :
            ens = ensemble_intersection(e1, e2)
            if equals(ens,A) :
                result += D_mass1[e1] * D_mass2[e2]
    return round(result,PRECISION)

def conjonctive_rule_dict(pwrset, D_mass1, D_mass2) : # Calcul les valeurs de la loi conjonctive pour tous les ensembles du powerset
    result = {}
    for e in pwrset :
        result[e] = conjonctive_rule(pwrset,D_mass1,D_mass2,e)
    return result

def dempster_rule(pwrset, D_mass1, D_mass2, A) : # Calcul la valeur de la loi de Dempster pour l'ensemble A
    if equals(A,'vide') : return 0
    return round((1/(1-degree_of_conflict(pwrset,D_mass1,D_mass2)))*conjonctive_rule(pwrset,D_mass1,D_mass2,A),PRECISION)

def dempster_rule_dict(pwrset, D_mass1, D_mass2) : # Calcul les valeurs de la loi de Dempster pour tous les ensembles du powerset
    result = {}
    for e in pwrset :
        result[e] = dempster_rule(pwrset,D_mass1,D_mass2,e)
    return result

def disjunctive_rule(pwrset, D_mass1, D_mass2, A) : # Calcul la valeur de la loi disjonctive pour l'ensemble A
    result = 0
    if equals(A,'vide') : return result
    for e1 in pwrset :
        for e2 in pwrset :
            ens = ensemble_union(e1, e2)
            if equals(ens,A) :
                result += D_mass1[e1] * D_mass2[e2]
    return result

def disjunctive_rule_dict(pwrset, D_mass1, D_mass2) : # Calcul les valeurs de la loi disjonctive pour tous les ensembles du powerset
    result = {}
    for e in pwrset :
        result[e] = disjunctive_rule(pwrset,D_mass1,D_mass2,e)
    return result

def DP_rule(pwrset, D_mass1, D_mass2, A) : # Calcul la valeur de la loi de Dubois et Prade pour l'ensemble A
    result = 0
    if equals(A,'vide') : return result
    for e1 in pwrset :
        for e2 in pwrset :
            if equals(ensemble_intersection(e1,e2),A) :
                result += D_mass1[e1] * D_mass2[e2]
            if (not equals(ensemble_intersection(e1,e2),'vide')) and equals(ensemble_union(e1,e2),A) :
                result += D_mass1[e1] * D_mass2[e2]
    return round(result,PRECISION)

def DP_rule_dict(pwrset, D_mass1, D_mass2) : # Calcul les valeurs de la loi de Dubois et Prade pour tous les ensembles du powerset
    result = {}
    for e in pwrset :
        result[e] = DP_rule(pwrset, D_mass1, D_mass2, e)
    return result

def RY_rule(pwrset, D_mass1, D_mass2, A) : # Calcul la valeur de la loi de Ronald Yager pour l'ensemble A
    result = 0
    if equals(A,'vide') : return result
    if equals(A,pwrset[-1]) : return round(conjonctive_rule(pwrset,D_mass1,D_mass2,'vide') + D_mass1[A]*D_mass2[A],PRECISION)
    return conjonctive_rule(pwrset,D_mass1,D_mass2,A)

def RY_rule_dict(pwrset, D_mass1, D_mass2) : # Calcul les valeurs de la loi de Dubois et Prade pour tous les ensembles du powerset
    result = {}
    for e in pwrset :
        result[e] = RY_rule(pwrset,D_mass1,D_mass2,e)
    return result

def representation() :
    return 'TODO'

def combinaison() :
    return 'TODO'


def start() :

    Omega = omega_generation()
    pwrset = powerset_generation(Omega)
    mass = mass_generation(pwrset)

    for i in range(int(input("Combien d\'ensemble à analyser ? "))) :
        A = input(str(i+1) + "**  Entrez le nom de l\'ensemble à analyser : ")
        belief = bel(pwrset, mass, A)
        plausible = pl(pwrset, mass, A)
        print("Croyance de " + A + " est de : " + str(belief))
        print("Plausibilité de " + A + " est de : " + str(plausible))

#start()