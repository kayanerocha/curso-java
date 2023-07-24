package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> items = new ArrayList<>();
	private Client client;
	
	public Order() {
		
	}

	public Order(Integer id, Date moment, OrderStatus satus) {
		this.id = id;
		this.moment = moment;
		this.status = satus;
	}

	public Order(Date moment, OrderStatus satus, Client client) {
		super();
		this.moment = moment;
		this.status = satus;
		this.client = client;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getSatus() {
		return status;
	}

	public void setSatus(OrderStatus satus) {
		this.status = satus;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double total = 0.0;
		for (OrderItem i : items) {
			total += i.subTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: ");
		sb.append(sdf.format(moment));
		sb.append("\nOrder statud: ");
		sb.append(status);
		sb.append("\nClient: ");
		sb.append(client.toString());
		sb.append("\nOrder items:\n");
		for (OrderItem i : items) {
			sb.append(i.toString() + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();
	}
	
}
