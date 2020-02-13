package com.example.examen2evapmdm;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Inicio_Fragment extends Fragment {

    EditText edtUsuario;
    EditText edtPassword;
    Button btInicio;
    FirebaseAuth.AuthStateListener mAuthListener;
    FirebaseAuth mAuth;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.usuariocontrasenya,container,false);

        edtUsuario = view.findViewById(R.id.edtemail);
        edtPassword = view.findViewById(R.id.edtpassword);

        btInicio = view.findViewById(R.id.btnsignin);

        ////Escuchador de cambios en los usuarios


        return view;
    }


}
