package bookingexhibition;

import bookingexhibition.config.kafka.KafkaProcessor;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//import org.springframework.data.repository.CrudRepository;
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PolicyHandler{
    @Autowired ExhibitionRepository exhibitionRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCompletedPayment_DecreasedAudience(@Payload CompletedPayment completedPayment){

        if(!completedPayment.validate()) return;

        System.out.println("\n\n##### listener DecreasedAudience : " + completedPayment.toJson() + "\n\n");

        //  PMJ Start
        Optional<Exhibition>   optionExhibition = exhibitionRepository.findById(completedPayment.getBookingId());
        Exhibition exhibition = optionExhibition.get();
        exhibition.setAudienceCnt(exhibition.getAudienceCnt()-1);   //관객수 감소
        exhibitionRepository.save(exhibition); 
        // PMJ End
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCanceledPayment_IncreasedAudience(@Payload CanceledPayment canceledPayment){

        if(!canceledPayment.validate()) return;

        System.out.println("\n\n##### listener IncreasedAudience : " + canceledPayment.toJson() + "\n\n");

        //  PMJ Start
        Optional<Exhibition> optionExhibition = exhibitionRepository.findById(canceledPayment.getBookingId());
        Exhibition exhibition = optionExhibition.get();
        exhibition.setAudienceCnt(exhibition.getAudienceCnt()+1);   //관객수 증가
        exhibitionRepository.save(exhibition);
        // PMJ End
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){
        
    }

}