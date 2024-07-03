package sn.masterclass.servicecostumer.mapper;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import sn.masterclass.servicecostumer.dto.CustomerDTO;
import sn.masterclass.servicecostumer.entities.Customer;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public CustomerDTO fromCustomer(Customer customer) {
        return modelMapper.map(customer, CustomerDTO.class);

    }
    public Customer fromCustomerDTO(CustomerDTO customerDTO) {
        return modelMapper.map(customerDTO, Customer.class);
    }
    public List<CustomerDTO> fromListCustomers(List<Customer> customers) {
        return customers.stream().map(c->modelMapper.map(c, CustomerDTO.class)).collect(Collectors.toList());

    }
}
