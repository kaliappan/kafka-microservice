# kafka-microservice
This project gives following features-

1. Gives an api to send one message to any topic in Kafka.

        * POST http://localhost:8080/kafka/topics/topic1/messages 
        
        send123
        
2. Given an api to retrieve messages from a topic from after the last read offset position.

        * GET http://localhost:8080/kafka/topics/topic1/messages
    
    Get Response: 
    [ "Partition=0 | Offset=3 | Key=null | Value=send123" ]
