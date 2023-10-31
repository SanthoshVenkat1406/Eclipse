package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.Train;
import com.example.demo.repository.ViewTrainRepository;

@Controller
public class ViewTrainsController {
	
	@Autowired
    private ViewTrainRepository trainRepository;

	@GetMapping("/viewTrains")
	public ModelAndView viewTrains() {
	    List<Train> allTrains = trainRepository.findAll();
	    ModelAndView modelAndView = new ModelAndView("viewTrains");
	    modelAndView.addObject("trains", allTrains);
	    return modelAndView;
	}
    @PostMapping("/removeTrains")
    public String removeTrains(@RequestParam("selectedTrains") List<String> selectedTrainNumbers) {
        // Implement the logic to remove selected trains based on their train numbers
        for (String trainNumber : selectedTrainNumbers) {
            trainRepository.deleteById(trainNumber); // Remove trains by their train number
        }
        return "redirect:/viewTrains"; // Redirect back to the viewTrains page after removal
    }
}
	