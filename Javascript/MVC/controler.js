class ControlerInteger {
    constructor(_modeleInteger, _modeleCheckbox)
    {
        var _view = new View();
        this.view = _view;
        this.view.setLabel(_modeleInteger.getValue());

        this.mediator = new Mediator(_view, _modeleInteger, _modeleCheckbox);

        var changeObserver = new ChangeLabelObserver(this.mediator);
        var btnPlusObserver = new buttonPlusObserver(this.mediator);
        var btnMoinsObserver = new buttonMoinsObserver(this.mediator);
        var sliderObserver = new SliderObserver(this.mediator);
        _modeleInteger.addObserver(btnMoinsObserver);
        _modeleInteger.addObserver(changeObserver);
        _modeleInteger.addObserver(btnPlusObserver);
        _modeleInteger.addObserver(sliderObserver);

        var checkboxObserver = new CheckboxObserver(this.mediator);
        _modeleCheckbox.addObserver(checkboxObserver);

        this.modeleCheckBox = _modeleCheckbox;
        this.modeleInteger = _modeleInteger;
        
        this.view.btnPlus.addEventListener("click", function()
        {
            _modeleInteger.plus();
        })

        this.view.textLabel.addEventListener("change", function()
        {
            _modeleInteger.changeByInput(Number.parseInt(this.value));        
        })

        this.view.btnMoins.addEventListener("click", function()
        {
            _modeleInteger.moins();
        })

        this.view.checkbox.addEventListener("change", function()
        {
            _modeleCheckbox.changeState(this.checked);
        })


        //Menu
        this.view.btnPlusMenu.addEventListener("click", function()
        {
            _modeleInteger.plus();
        })

        this.view.btnMoinsMenu.addEventListener("click", function()
        {
            _modeleInteger.moins();
        })

        //Slider
        this.view.slider.addEventListener("change", function()
        {
            _modeleInteger.changeByInput(Number.parseInt(this.value));
        })
    }

    
}

class Mediator{
    constructor(_view, _modeleInteger, _modeleCheckbox)
    {
        this.view = _view;
        this.modeleInteger = _modeleInteger;
        this.modeleCheckBox = _modeleCheckbox;
    }

    updateButton()
    {
        if(this.modeleCheckBox.getState()) this.view.disableAll();
        else 
        {
            this.view.enableAll();
            if(this.modeleInteger.getValue() >= 10) this.view.btnPlus.disabled = true;
            else this.view.btnPlus.disabled = false; 
                
            if(this.modeleInteger.getValue() <= 0) this.view.btnMoins.disabled = true;
            else this.view.btnMoins.disabled = false;

        }  
        
    }

    updateSlider(_value){
        this.view.slider.value = _value;
    }


    changeText(_text)
    {
        
        this.view.textLabel.value = _text;
    }

    
}

