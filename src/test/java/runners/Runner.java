package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    //@RunWith:Cucumber.class lari calistirmak icin kullanilir, kullanmadan Runner calismaz
    @RunWith(Cucumber.class)

    //calistirmak istedigim feature file belirtiyorum
    // @CucumberOptions() : feature path i eklemek icin kullanilir, step deginitin path, tag, dryRun, report icerir
    @CucumberOptions(

            features = "./src/test/resources/firstfeaturefile.feature",//Zorunludur=>Feature dosyasini pathini girmemiz lazim
            glue ="stepdefinitions",//Zrunludur => Stepdefinition adresi(path)'i
            tags ="@google_search",//hangi feature file kosmali onu belirtiyoruz=>Eger tags kullanmaz isek Runne tum feature calistirir
            dryRun = false //opsiyoneldir

    )
    //      Runner:feature file lari calistirmak icin kullanilir
    public class Runner{

      /*
      Runner:feature file lari calistirmak icin kullanilir
      @RunWith:Cucumber.class lari calistirmak icin kullanilir, kullanmadan Runner calismaz
      @CucumberOptions() : feature path i eklemek icin kullanilir, step deginitin path, tag, dryRun, report icerir
        -feature : feature dosyasi patch ini verir, spesifik bir feature isaret edebilir
        -glue: stepdefinition class'inda path'i isaret eder
        -tags:hangi feature yada senaryo kosacak onu belirler.Bu tag'i feature file ekliyoruz
        -dryRun: herhangi bir bir JAVA kod eksikligini kontrol eder (step definition kullaniriz)
                -dryRun 2 value alir (deger) alir, true(head-less) veya false
          1-dryRun=false==> Herhangi bir JAVA kodunun eksik olup olmadigini kontrol ederken tarayicidan testleri calistirir
          2-dryRun=true==>Herhangi bir JAVA kodunun eksik olup olmadigini kontrol ederken olmadan testleri calistirir

       */


    }


