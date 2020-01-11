package com.example.database_assignment.service;

import com.example.database_assignment.model.*;
import com.example.database_assignment.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ICreateDatabaseImpl implements IDatabase{

    @Autowired
    private CageRepository cageRepository;
    @Autowired
    private AnimalRepository animalRepository;
    @Autowired
    private SupplierRepository supplierRepository;
    @Autowired
    private FoodItemRepository foodItemRepository;
    @Autowired
    private InHouseVetRepository inHouseVetRepository;
    @Autowired
    private ExternalVetRepository externalVetRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private StaffRepository staffRepository;

    @Override
    @Transactional
    public void createDatabase() {
        Cage cage1 = new Cage("C1","Amazon");
        Cage cage2 = new Cage("C2","Amazon");
        Animal a1 = new Animal("Lion",5);
        Animal a2 = new Animal("parrot",6);

        cage1.setAnimal(a1);
        cage2.setAnimal(a2);
        cageRepository.save(cage1);
        cageRepository.save(cage2);

        //////////////////////////////////////////////////////////////////////

        Supplier s1 = new Supplier("Jock",123456,"LA");
        Supplier s2 = new Supplier("Jason",123456,"New York");

        Food_Item item1 = new Food_Item("banana",10);
        Food_Item item2 = new Food_Item("chicken",10);
        Food_Item item3 = new Food_Item("beef",10);
        Food_Item item4 = new Food_Item("grape",10);


        s1.getFoodItemList().add(item1);
        s1.getFoodItemList().add(item2);
        s2.getFoodItemList().add(item3);
        s2.getFoodItemList().add(item4);

        supplierRepository.save(s1);
        supplierRepository.save(s2);

        /////////////////////////////////////////////////////////////////////////////////////////

        a1.getItemList().add(item2);
        a1.getItemList().add(item3);
        a2.getItemList().add(item1);
        a2.getItemList().add(item4);

        item1.getAnimalList().add(a2);
        item2.getAnimalList().add(a1);
        item3.getAnimalList().add(a1);
        item4.getAnimalList().add(a2);

        animalRepository.save(a1);
        animalRepository.save(a2);

        //////////////////////////////////////////////////////////////////////////////////////////////

        In_House_Vet in1 = new In_House_Vet("Aung Aung","MSc",4000000.0);
        In_House_Vet in2 = new In_House_Vet("Maw Maw","BSc",4500000.0);

        External_Vet ex1 = new External_Vet("John","MSc","USA",30000.0);
        External_Vet ex2 = new External_Vet("Thomas","BSc","India",35000.0);

        inHouseVetRepository.save(in1);
        inHouseVetRepository.save(in2);

        externalVetRepository.save(ex1);
        externalVetRepository.save(ex2);

        /////////////////////////////////////////////////////////////////////////////////////////////////////

        Category c1 = new Category("mammals");
        Category c2 = new Category("birds");

        c1.getListAnimal().add(a1);
        c2.getListAnimal().add(a2);

        categoryRepository.save(c1);
        categoryRepository.save(c2);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////

        Staff staff1 = new Staff("Mg Mg",23,200000.0,Gender.MALE);
        Staff staff2 = new Staff("Ma Ma",26,200000.0,Gender.FEMALE);

        staffRepository.save(staff1);
        staffRepository.save(staff2);


    }
}
