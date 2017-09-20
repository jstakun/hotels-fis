package net.gmsworld.server.camel;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class CountAggregateStrategy implements AggregationStrategy {

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		if (oldExchange == null) {
            // this is the first time so no existing aggregated exchange
            newExchange.setProperty("counter", 1);
        } else {
        	int counter = oldExchange.getProperty("counter", Integer.class);
            newExchange.setProperty("counter", counter+1);
        }
		return newExchange;
		
	}

}
