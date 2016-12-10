package afhs.tsa.softdev.interactivechemistry;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

public class AtomBuilder extends AppCompatActivity {


    TextView drag, drop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atom_builder);


        drag = (TextView) findViewById(R.id.drag);
        drop = (TextView) findViewById(R.id.drop);

        drag.setOnLongClickListener(longClickListener);


        
        int protons = 0; //integer value of protons
        int electrons = 0; //integer value of electrons
        String element; //String value of element name, will be displayed on button

        if (protons == 1) {
            element = "Hydrogen";
        }

        if (protons == 2){
            element = "Helium";
        }

        if (protons == 3) {
            element = "Lithium";
        }

        if (protons == 4) {
            element = "Beryllium";
        }

        if (protons == 5) {
            element = "Boron";
        }

        if (protons == 6) {
            element = "Carbon";
        }

        if (protons == 7) {
            element = "Nitrogen";
        }

        if (protons == 8) {
            element = "Oxygen";
        }

        if (protons == 9) {
            element = "Fluorine";
        }

        if (protons == 10) {
            element = "Neon";
        }

        if (protons == 11) {
            element = "Sodium";
        }

        if (protons == 12) {
            element = "Magnesium";
        }

        if (protons == 13) {
            element = "Aluminium";
        }

        if (protons == 14) {
            element = "Silicon";
        }

        if (protons == 15) {
            element = "Phosphorus";
        }

        if (protons == 16) {
            element = "Sulfur";
        }

        if (protons == 17) {
            element = "Chlorine";
        }

        if (protons == 18) {
            element = "Argon";
        }

        if (protons == 19) {
            element = "Potassium";
        }

        if (protons == 20) {
            element = "Calcium";
        }

        if (protons == 21) {
            element = "Scandium";
        }

        if (protons == 22) {
            element = "Titanium";
        }

        if (protons == 23) {
            element = "Vanadium";
        }

        if (protons == 24) {
            element = "Chromium";
        }

        if (protons == 25) {
            element = "Manganese";
        }

        if (protons == 26) {
            element = "Iron";
        }

        if (protons == 27) {
            element = "Cobalt";
        }

        if (protons == 28) {
            element = "Nickel";
        }

        if (protons == 29) {
            element = "Copper";
        }

        if (protons == 30) {
            element = "Zinc";
        }

        if (protons == 31) {
            element = "Gallium";
        }

        if (protons == 32) {
            element = "Germanium";
        }

        if (protons == 33) {
            element = "Arsenic";
        }

        if (protons == 34) {
            element = "Selenium";
        }

        if (protons == 35) {
            element = "Bromine";
        }

        if (protons == 36) {
            element = "Krypton";
        }

        if (protons == 37) {
            element = "Rubidium";
        }

        if (protons == 38) {
            element = "Strontium";
        }

        if (protons == 39) {
            element = "Yttrium";
        }

        if (protons == 40) {
            element = "Zirconiu,";
        }

        if (protons == 41) {
            element = "Niobium";
        }

        if (protons == 42) {
            element = "Molybdenum";
        }

        if (protons == 43) {
            element = "Technetium";
        }

        if (protons == 44) {
            element = "Ruthenium";
        }

        if (protons == 45) {
            element = "Rhodium";
        }

        if (protons == 46) {
            element = "Palladium";
        }

        if (protons == 47) {
            element = "Silver";
        }

        if (protons == 48) {
            element = "Cadmium";
        }

        if (protons == 49) {
            element = "Indium";
        }

        if (protons == 50) {
            element = "Tin";
        }

        if (protons == 51) {
            element = "Antimony";
        }

        if (protons == 52) {
            element = "Tellurium";
        }

        if (protons == 53) {
            element = "Iodine";
        }

        if (protons == 54) {
            element = "Xenon";
        }



    }

    View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            ClipData data = ClipData.newPlainText("","");
            View.DragShadowBuilder myShadowBuilder = new View.DragShadowBuilder(v);
            v.startDrag(data, myShadowBuilder, v, 0);
            return true;
        }
    };

    View.OnDragListener dragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {

            int dragEvent = event.getAction();
            switch (dragEvent){
                case DragEvent.ACTION_DRAG_ENTERED:
                    final View view = (View) event.getLocalState();

                    if (view.getId() == R.id.drag){
                        drag.setText("Drag has entered area");
                    }
                    break;
                case DragEvent.ACTION_DRAG_EXITED:

                    /*final View view2 = (View) event.getLocalState();

                    if (view2.getId() == R.id.drag){
                        drag.setText("Drag has exited area");
                    }*/
                    break;
                case DragEvent.ACTION_DROP:

                    /*final View view3 = (View) event.getLocalState();

                    if (view3.getId() == R.id.drag){
                        drag.setText("Drag has been dropped in area");
                    }*/
                    break;
            }
            return true;
        }
    };
}