from itertools import chain, combinations

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
    for char_p in P :
        present = False
        i = 0
        while (not present) and i<len(A) :
            if char_p == A[i] :
                return True
            else:
                i+=1
    return False

def equals(A, B) : # Teste l'égalité entre deux ensembles
    if (include(A,B) and include(B,A)) :
        return True
    return False

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
    

Omega = omega_generation()
pwrset = powerset_generation(Omega)
mass = mass_generation(pwrset)

for i in range(int(input("Combien d\'ensemble à analyser ? "))) :
    A = input(str(i+1) + "**  Entrez le nom de l\'ensemble à analyser : ")
    belief = bel(pwrset, mass, A)
    plausible = pl(pwrset, mass, A)
    print("Croyance de " + A + " est de : " + str(belief))
    print("Plausibilité de " + A + " est de : " + str(plausible))