package org.example;

import java.util.ArrayList;

class Gadget {//Abstract class
    private String type;
    private String owner;
    private String supertype;
    private static ArrayList<String> typeList = new ArrayList<String>();
    private static ArrayList<String> ownerList = new ArrayList<String>();
    private static ArrayList<String> supertypeList = new ArrayList<String>();
    private static int totalGadget;

    Gadget(String owner, String type, String supertype){

        this.owner = owner;
        this.type = type;
        this.supertype = supertype;
        typeList.add(type);
        ownerList.add(owner);
        supertypeList.add(supertype);
        totalGadget++;
    }

    public static ArrayList<String> getTypeList() {
        return typeList;
    }

    public static ArrayList<String> getOwnerList() {
        return ownerList;
    }

    public static ArrayList<String> getSupertypeList() {
        return supertypeList;
    }

    void info(){
        System.out.println("Information about this gadget, Owner : "+this.owner+", Type : "+this.type+", Category : "+this.supertype);
    }

    void infoAll(){
        for (int i = 0; i<totalGadget;i++){
            System.out.println("Information about this gadget, Owner : "+ownerList.get(i)+", Type : "+typeList.get(i)+", Category : "+supertypeList.get(i));
        }
    }
}

class MobileDevices extends Gadget{//Abstract class
    MobileDevices(String owner, String type){
        super(owner,type,"Mobile Devices");
    }
}

//a
class Smartphones extends MobileDevices{//Concrete class
    Smartphones(String owner){
        super(owner,"Smartphones");
    }
}

class Tablets extends MobileDevices{//Concrete class
    Tablets(String owner){
        super(owner,"Tablets");
    }
}

class WearableTech extends MobileDevices{//Concrete class
    WearableTech(String owner){
        super(owner,"Wearable Tech");
    }
}
//a

class SmartHomeGadgets extends Gadget{//Abstract class
    SmartHomeGadgets(String owner, String type){
        super(owner,type,"Smart Home Gadgets");
    }
}

//b
class SmartSpeakers extends SmartHomeGadgets{//Concrete class
    SmartSpeakers(String owner){
        super(owner,"Smart Speakers");
    }
}

class SmartThermostats extends SmartHomeGadgets{//Concrete class
    SmartThermostats(String owner){
        super(owner,"Smart Thermostats");
    }
}

class SecurityCameras extends SmartHomeGadgets{//Concrete class
    SecurityCameras(String owner){
        super(owner,"Security Cameras");
    }
}
//b

class HealthFitnessGadgets extends Gadget{//Abstract class
    HealthFitnessGadgets(String owner, String type){
        super(owner,type,"Health and Fitness Gadgets");
    }
}

//c
class FitnessTrackers extends HealthFitnessGadgets{//Concrete class
    FitnessTrackers(String owner){
        super(owner,"Fitness trackers");
    }
}

class MedicalDevices extends HealthFitnessGadgets{//Concrete class
    MedicalDevices(String owner){
        super(owner,"Medical Devices");
    }
}

class SmartScales extends HealthFitnessGadgets{//Concrete class
    SmartScales(String owner){
        super(owner,"Smart Scales");
    }
}
//c

class EntertainmentGadgets extends Gadget{//Abstract class
    EntertainmentGadgets(String owner, String type){
        super(owner,type,"Entertainment Gadgets");
    }
}

//d
class StreamingDevices extends EntertainmentGadgets{//Concrete class
    StreamingDevices(String owner){
        super(owner,"Streaming Devices");
    }
}

class GamingConsoles extends EntertainmentGadgets{//Concrete class
    GamingConsoles(String owner){
        super(owner,"Gaming Consoles");
    }
}

class EReaders extends EntertainmentGadgets{//Concrete class
    EReaders(String owner){
        super(owner,"E-Readers");
    }
}
//d

class ProductivityGadgets extends Gadget{//Abstract class
    ProductivityGadgets(String owner, String type){
        super(owner,type,"Productivity Gadgets");
    }
}

//e
class LaptopsTablets extends ProductivityGadgets{//Concrete class
    LaptopsTablets(String owner){
        super(owner,"Laptops and Tablets");
    }
}

class PortableChargers extends ProductivityGadgets{//Concrete class
    PortableChargers(String owner){
        super(owner,"Portable Chargers");
    }
}

class WirelessKeyboardsMice extends ProductivityGadgets{//Concrete class
    WirelessKeyboardsMice(String owner){
        super(owner,"Wireless keyboards and Mice");
    }
}
//e

class KitchenGadgets extends Gadget{//Abstract class
    KitchenGadgets(String owner, String type){
        super(owner,type,"Kitchen Gadgets");
    }
}

//f
class SmartAppliances extends KitchenGadgets{//Concrete class
    SmartAppliances(String owner){
        super(owner,"Smart Appliances");
    }
}

class FoodProcessors extends KitchenGadgets{//Concrete class
    FoodProcessors(String owner){
        super(owner,"Food Processors");
    }
}

class DigitalScales extends KitchenGadgets{//Concrete class
    DigitalScales(String owner){
        super(owner,"Digital Scales");
    }
}
//f