package com.serenitydojo.ecomerce.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class Practica01Steps {
    @Given("Usuario administrador")
    public void usuario_administrador() {
        System.out.println("Edinson");
    }
    @When("ingreso mis crecenciales:")
    public void ingreso_mis_crecenciales(DataTable dataTable) {

        List<Map<String, String>> datos = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> data : datos){

            System.out.println("El usuario es : " + data.get("usuario"));
        }


    }
    @Then("ingreso correctamente")
    public void ingreso_correctamente() {
        System.out.println("Quevedo");
    }
}
