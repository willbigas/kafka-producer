package br.com.willbigas.kafkaproducer.controller;

import br.com.willbigas.kafkaproducer.producer.TopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

	private final TopicProducer topicProducer;

	@GetMapping(value = "/send")
	public void send() {
		topicProducer.send("Mensagem de teste enviada ao tópico");
	}
}
