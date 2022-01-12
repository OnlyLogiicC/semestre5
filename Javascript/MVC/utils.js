class Observable {
    constructor() {
        this.listObserver = [];
        this.state = false;
    }

    setChanged(_state) {
        this.state = _state;
    }

    addObserver(observer) {
        this.listObserver.push(observer);
    }

    notifyObserver() {
        if (this.state == true) {

            for (var i = 0; i < this.listObserver.length; i++) {
                this.listObserver[i].update(this);
            }
        }

        this.state = false;

    }

    getValue() {

    }
}


class Observer {
    constructor() {

    }

    update(observable) {

    }

}

class ModelInteger extends Observable {
    constructor() {
        super();
        this.x = 5;
       
    }

    setValue(int) {
        this.x = int;
        this.setChanged(true);
        this.notifyObserver();
    }

    plus() {
       if(this.x <= 10)
       {
            this.setValue(this.x + 1);
       }
        
    }
    moins() {
        if(this.x >= 0)
        {
            this.setValue(this.x - 1);
        }
       
    }

    changeByInput(_value)
    {
        
        if(_value != this.x)
        {
            var temp = _value;
            if(_value > 10) temp = 10;
            if(_value < 0) temp = 0;
            this.setValue(temp)
        }
    }

   

    getValue() {
        return this.x;
    }

   
}


class ModeleCheckbox extends Observable
{
    constructor()
    {
        super();
        this.isActivated = false;
    }

    changeState(_state)
    {
        this.isActivated = _state;
        this.setChanged(true);
        this.notifyObserver();
    }

    getState(){
        return this.isActivated;
    }
    
}




class SliderObserver extends Observer {
    constructor(_mediator){
        super();
        this.mediator = _mediator;
    }

    update(observable){
        this.mediator.updateSlider(observable.getValue());
    }
}
class CheckboxObserver extends Observer {
    constructor(_mediator){
        super();
        this.mediator = _mediator;
    }

    update(observable){
        this.mediator.updateButton();
    }
}

class ChangeLabelObserver extends Observer {

    constructor(_mediator) {
        super();
        this.mediator = _mediator;
    }

    update(observable) {
        this.mediator.changeText(observable.getValue());
    }
}

class buttonPlusObserver extends Observer {
    constructor(_mediator) {
        super();
        this.mediator = _mediator;
    }

    update(observable) {
       this.mediator.updateButton();
    }
}

class buttonMoinsObserver extends Observer {
    constructor(_mediator) {
        super();
        this.mediator = _mediator;
    }

    update(observable) {
        this.mediator.updateButton();
    }
}

class SommeObserver extends Observer{
    constructor(_modele1, _modele2)
    {
        super();
        this.modele1 = _modele1;
        this.modele2 = _modele2;

        this.modele1.addObserver(this);
        this.modele2.addObserver(this);
    }

    update(observable)
    {
        console.log()
        if(observable == this.modele1) this.modele2.changeByInput(10-observable.getValue());
        else this.modele1.changeByInput(10-observable.getValue());


    }
    
}



