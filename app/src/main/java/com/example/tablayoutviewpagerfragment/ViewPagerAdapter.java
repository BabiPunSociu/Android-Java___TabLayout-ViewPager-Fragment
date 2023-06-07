package com.example.tablayoutviewpagerfragment;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new FavoriteFragment();
            case 2:
                return new HistoryFragment();
            case 3:
                return new AccountFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getCount() { // Trả về số lượng tab
        return 4;
    }

    // Set title cho fragment
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Home";
                break;
            case 1:
                title = "Favorite";
                break;
            case 2:
                title = "History";
                break;
            case 3:
                title = "Account";
                break;
            default:
                title = "Home";
                break;
        }
        return title;
    }
}
