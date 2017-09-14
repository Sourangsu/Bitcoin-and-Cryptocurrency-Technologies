import java.util.HashSet;
import java.util.Set;

public class MalDoNothing implements Node {

	public double p_graph;
    public double p_malicious;
    public double p_txDistribution;
    public int numRounds;
    public Set<Transaction> pendingTransactions;

	public MalDoNothing(double p_graph, double p_malicious, double p_txDistribution, int numRounds) {
	        this.p_graph= p_graph;
	        this.p_malicious = p_malicious;
	        this.p_txDistribution = p_txDistribution;
	        this.numRounds = numRounds;
	        this.pendingTransactions = new HashSet<Transaction>();
	    }
	@Override
	public void setFollowees(boolean[] followees) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPendingTransaction(Set<Transaction> pendingTransactions) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<Transaction> sendToFollowers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void receiveFromFollowees(Set<Candidate> candidates) {
		// TODO Auto-generated method stub

	}

}
