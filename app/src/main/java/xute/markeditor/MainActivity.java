package xute.markeditor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import xute.markdeditor.MarkDEditor;

public class MainActivity extends AppCompatActivity {
  int heading = -1;
  private MarkDEditor markDEditor;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    markDEditor = findViewById(R.id.mdEditor);

  }

  public void changeHeading(View view) {
    int _heading = ((++heading) % 5);
    Log.d("MainAct", "New Heading " + _heading);
    markDEditor.setHeading(_heading);
  }
}
