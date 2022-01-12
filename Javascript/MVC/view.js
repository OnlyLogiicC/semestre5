class View {
    constructor()
    {
        this.btnPlus = document.createElement("input");
        this.btnPlus.id="plus";
        this.btnPlus.type = "button";
        this.btnPlus.value = "plus";
        this.btnPlus.toggleAttribute("tooltip");
        this.btnPlus.title="Incrémente de 1";


        this.btnMoins = document.createElement("input");
        this.btnMoins.id="moins";
        this.btnMoins.type = "button";
        this.btnMoins.value = "moins";
        this.btnMoins.toggleAttribute("tooltip");
        this.btnMoins.title="Decrémente de 1";

        this.textLabel = document.createElement("input");
        this.textLabel.id="value";
        this.textLabel.type = "text";

        this.checkbox = document.createElement("input");
        this.checkbox.id = "checkbox";
        this.checkbox.type = "checkbox";
        this.checkbox.toggleAttribute("tooltip");
        this.checkbox.title="Bloque les boutons et le slider";


        //Menu déroualnt

        this.menu_deroulant = document.createElement("div");
        this.menu_deroulant.id = "menu-deroulant";

        this.li = document.createElement("li");
        this.li.innerHTML = "Menu";
        this.li.id="li-menu"

        this.ul = document.createElement("ul");
        this.btnPlusMenu = document.createElement("input");
        this.btnPlusMenu.type = "button";
        this.btnPlusMenu.value = "plus";
        this.btnPlusMenu.toggleAttribute("tooltip");
        this.btnPlusMenu.title="Incrémente de 1";

        this.btnMoinsMenu = document.createElement("input");
        this.btnMoinsMenu.type = "button";
        this.btnMoinsMenu.value = "moins";
        this.btnMoinsMenu.toggleAttribute("tooltip");
        this.btnMoinsMenu.title="Decrémente de 1";

        
        this.ul.appendChild(this.btnPlusMenu);
        this.ul.appendChild(this.btnMoinsMenu);
        this.li.appendChild(this.ul);
        this.menu_deroulant.appendChild(this.li);


        //Slider
        this.slider = document.createElement("input");
        this.slider.type = "range";
        this.slider.value = "5";
        this.slider.min = "0";
        this.slider.max = "10";
        this.slider.step = "1";
        this.slider.id="slider";
        this.slider.toggleAttribute("tooltip");
        this.slider.title="Change les valeurs via le slider";
        

        var div = document.createElement("div");
        div.id="panel";
        div.appendChild(this.menu_deroulant);
        div.appendChild(this.btnMoins);
        div.appendChild(this.textLabel);
        div.appendChild(this.btnPlus);
        div.appendChild(this.checkbox);
        div.appendChild(this.slider);
        


        document.getElementById("main").appendChild(div);

    }

    setLabel(_value)
    {
        this.textLabel.value = _value;
    }

    disableAll(){
        this.btnMoins.disabled = true;
        this.btnPlus.disabled = true;
        this.textLabel.disabled = true;
        this.slider.disabled = true;
        this.btnMoinsMenu.disabled = true;
        this.btnPlusMenu.disabled = true;
    }

    enableAll(){
        this.btnMoins.disabled = false;
        this.btnPlus.disabled = false;
        this.textLabel.disabled = false; 
        this.slider.disabled = false;
        this.btnMoinsMenu.disabled = false;
        this.btnPlusMenu.disabled = false;
    }
}