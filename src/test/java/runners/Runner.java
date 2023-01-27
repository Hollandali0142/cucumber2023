package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.junit.runner.RunWith;

    //@RunWith:Cucumber.class lari calistirmak icin kullanilir, kullanmadan Runner calismaz
    @RunWith(Cucumber.class)

    //calistirmak istedigim feature file belirtiyorum
    // @CucumberOptions() : feature path i eklemek icin kullanilir, step deginitin path, tag, dryRun, report icerir
    @CucumberOptions(
            plugin = {
                   "pretty",
                    "html:target/default-cucumber-reports.html",
                    "json:target/json-reports/cucumber.json",
                    "junit:target/xml-report/cucumber.xml",
                    "rerun:target/failedRerun.txt",
                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
            },
            features = "src/test/resources",//Zorunludur=>Feature dosyasini pathini girmemiz lazim
          glue ="stepdefinitions",//Zrunludur => Stepdefinition adresi(path)'i
            tags ="@room_rezervasyonu",//hangi feature file kosmali onu belirtiyoruz=>Eger tags kullanmaz isek Runne tum feature calistirir
            dryRun =false//opsiyoneldir false yaparsak tarayici ile calisir

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


