package com.example.application;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.annotation.NonNull;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;



public class MainActivity extends AppCompatActivity {
	
	BottomNavigationView bottomNav;
	HomeFragment homeFragment = new HomeFragment();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		
		bottomNav = findViewById(R.id.bottomNav);
		getSupportFragmentManager().beginTransaction().replace(R.id.page_container, homeFragment).commit();
		bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
			
			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem item){
				Fragment selectedFragment = null;
				switch(item.getItemId()){
					case R.id.nav_home:
						selectedFragment = new HomeFragment();
						break;
					case R.id.nav_katalog:
						selectedFragment = new KatalogFragment();
					    break;
					case R.id.nav_chat:
						selectedFragment = new ChatFragment();
						break;
					case R.id.nav_promosi:
						selectedFragment = new PromosiFragment();
						break;
					case R.id.nav_aplikasi:
						selectedFragment = new AplikasiFragment();
						break;
				}
				
				getSupportFragmentManager().beginTransaction().replace(R.id.page_container, selectedFragment).commit();
				return true;
			}
		
		});
	}
}
