package ismek.burhangok.datapassingbetweenfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

View fragmentView;
TextView getMessageTV;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        fragmentView = inflater.inflate(R.layout.fragment_blank,null);

        getMessageTV = fragmentView.findViewById(R.id.text);

        getMessageTV.setText(getArguments().getString("MESSAGE"));

        return fragmentView;
    }

}
