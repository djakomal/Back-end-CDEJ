package Back_end.service;

import Back_end.model.Transaction;
import Back_end.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Optional<Transaction> getTransactionById(String id) {
        return transactionRepository.findById(id);
    }

    public List<Transaction> getTransactionsByType(String type) {
        return transactionRepository.findByType(type);
    }

    public List<Transaction> getTransactionsByCategorie(String categorie) {
        return transactionRepository.findByCategorie(categorie);
    }

    public Transaction addTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public Transaction updateTransaction(String id, Transaction transactionDetails) {
        Transaction transaction = transactionRepository.findById(id).orElseThrow(() -> new RuntimeException("Transaction not found with id " + id));
        transaction.setType(transactionDetails.getType());
        transaction.setMontant(transactionDetails.getMontant());
        transaction.setDescription(transactionDetails.getDescription());
        transaction.setDateTransaction(transactionDetails.getDateTransaction());
        transaction.setCategorie(transactionDetails.getCategorie());
        transaction.setReference(transactionDetails.getReference());
        transaction.setStatut(transactionDetails.getStatut());
        transaction.setAgentDemandeur(transactionDetails.getAgentDemandeur());
        transaction.setDate(transactionDetails.getDate());
        return transactionRepository.save(transaction);
    }

    public void deleteTransaction(String id) {
        transactionRepository.deleteById(id);
    }
} 