package pro.rudloff.search_to_browser;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent launcherIntent = getIntent();
        Intent browserIntent = new Intent(Intent.ACTION_WEB_SEARCH);
        browserIntent.putExtra(
                SearchManager.QUERY, launcherIntent.getStringExtra(SearchManager.QUERY));

        this.startActivity(browserIntent);

        finish();
    }
}
