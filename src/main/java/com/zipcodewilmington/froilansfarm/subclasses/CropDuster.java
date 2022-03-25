package com.zipcodewilmington.froilansfarm.subclasses;

import com.zipcodewilmington.froilansfarm.collections.CropRow;
import com.zipcodewilmington.froilansfarm.collections.Field;
import com.zipcodewilmington.froilansfarm.superclasses.Aircraft;
import com.zipcodewilmington.froilansfarm.superclasses.Crop;
import com.zipcodewilmington.froilansfarm.superclasses.Person;

public class CropDuster extends Aircraft {

    private Boolean mounted = false;
    private Boolean flying = false;

    public CropDuster(){
        super("Dustie");
    }

    public CropDuster(String name) {
        super(name);
    }


    @Override
    public void flyTakeoff() {
        if(ridersList().size()>0 && !flying){
            flying = true;
        }
    }

    @Override
    public void flyLand() {
        if(flying){
            flying = false;
        }
    }

    @Override
    public Boolean flyStatus() {
        return flying;
    }

    @Override
    public String makeNoise() {
        return "Plane go brrrrr";
    }


    @Override
    public void ride(Person person) {
        ridersList().add(person);
        mounted = true;
    }

    @Override
    public void unride(Person farmer) {
        ridersList().remove(farmer);
        if(ridersList().isEmpty()){
            mounted = false;
        }
    }

    @Override
    public Boolean getMountStatus() {return mounted;
    }

    public void fertalize(Field cropField) {

        for(int i = 0; i < cropField.size(); i++){
            for(int j = 0; j < cropField.getCropRow(i).size(); j++){
                cropField.getCrop(i,j).fertalizeMe();
            }
        }

    }

    //public void fertalize(Field<CropRow> field) {

//        for(int i = 0; i < field.size(); i++){
//            for(int j = 0; j < field.get(i).size(); j++){
//                field.get(i).get(j)
//
//            }
//        }

    //}


}
