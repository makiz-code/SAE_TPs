package com.example.rest;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class MyAPI {
    public static ArrayList<Etudiant> liste = new ArrayList<>();
    static {
        liste.add(new Etudiant(0, "A", 19));
        liste.add(new Etudiant(1, "A", 19));
        liste.add(new Etudiant(2, "A", 19));
        liste.add(new Etudiant(3, "A", 19));
    }

    @GetMapping(value = "/lst")
    public ArrayList<Etudiant> getAllEtudiant() {
            return liste;
    }

    @GetMapping(value = "/get")
    public Etudiant getEtudiant(int identifiant) {
        return liste.get(identifiant);
    }

    @PostMapping(value = "/add")
    public Etudiant addEtudiant(Etudiant etudiant) {
        liste.add(etudiant);
        return etudiant;
    }

    @PutMapping(value = "/put")
    public void updateEtudiant(int identifiant, String nom) {
        liste.get(identifiant).setNom(nom);
    }

    @DeleteMapping(value = "/del")
    public void deleteEtudiant(int identifiant) {
        liste.remove(identifiant);
    }

    @GetMapping(value = "/bnj")
    public String bonjour() {
        return "Bonjour !";
    }

    @GetMapping(value = "/bns")
    public String bonsoir(){
        return "Bonsoir !";
    }

    @GetMapping(value = "/etd")
    public Etudiant getEtudiant() {
        return new Etudiant(1, "A", 19);
    }

    @GetMapping(value = "/sum")
    public double somme(double a, double b) {
        return a + b;
    }
}
