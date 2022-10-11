/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo10.app.rents.service;

import com.grupo10.app.rents.interfaces.IReservationRepository;
import com.grupo10.app.rents.entities.Category;
import com.grupo10.app.rents.interfaces.ICategoryRepository;
import com.grupo10.app.rents.entities.Quadbike;
import com.grupo10.app.rents.entities.Reservation;
import com.grupo10.app.rents.interfaces.IReservationRepository;
import com.grupo10.app.rents.repository.ReservationRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres
 */
@Service
public class ReservationService {

    @Autowired
    IReservationRepository repository;

    @Autowired
    ReservationRepository reservationRepository; 

    public Iterable<Reservation> get() {
        Iterable<Reservation> response = repository.findAll();
        return response;
    }

    public Reservation create(Reservation request) {

        //Optional<Reservation> cat = reservationRepository.findById(request.getReservation().getId());
//        if (!cat.isEmpty()) {
//            request.setReservation(cat.get());
//        }
//        if (request.getName() != null) {
//            repository.save(request);
//            return "created....";
//        } else {
//            return "falta el nombre";
//        }

    
        //Optional<Category> cat = categoryRepository.findById(request.getCategory().getId());
            return repository.save(request);
            }
    }
