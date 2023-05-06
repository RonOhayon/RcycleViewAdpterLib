
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rcycleviewmoneytemplet.R;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {
    private ArrayList<Transaction>transactions;

    public recyclerAdapter(ArrayList<Transaction> transactions){
        this.transactions = transactions;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView transactionNameLBL;
        private TextView transactionNumLBL;
        public MyViewHolder(final View view){
            super(view);
            transactionNameLBL = view.findViewById(R.id.recycle_item_name);
            transactionNumLBL  = view.findViewById(R.id.recycle_item_sum);
        }
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    String incName = transactions.get(position).getTransactionName();
    String incSum = String.valueOf(transactions.get(position).getTransactionSum());
    holder.transactionNameLBL.setText(incName);
    holder.transactionNumLBL.setText(incSum);
    }

    @Override
    public int getItemCount() {
        return transactions.size();
    }
}
