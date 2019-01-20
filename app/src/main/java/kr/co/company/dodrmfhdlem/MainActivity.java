//////////체크박스 앱/////////////
package kr.co.company.dodrmfhdlem;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button button, button2;  //버튼들 설정
    TextView text;            //text 설정
    int count = 0;            //count 변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
        button = (Button)findViewById(R.id.button);
        //증가 버튼 클릭 이벤트
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;       //숫자 증가
                text.setText("현재 개수 = "+count); //문장 설정
            }
        });
        button2 = (Button)findViewById(R.id.button2);
        //감소 버튼 클릭 이벤트
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;    //숫자 감소
                text.setText("현재 개수 = "+count); //문장 설정
            }
        });
        //상태가 바뀌어도 저장하기 위해
        if(savedInstanceState != null){
            count = savedInstanceState.getInt("count");
            text.setText("현재 개수="+count); //문장 설정
        }

    }
    // @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);

    }

}
