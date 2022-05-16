package com.example.enrolment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_enrolment.*

class EnrolmentActivity : AppCompatActivity() {

    val TAG : String = "jeongmin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enrolment)

    }
    // 제출 버튼 눌렀을 때
    fun onClickSubmit(view: View) {

        val intent = Intent(this, CheckActivity::class.java)

        //인적사항
        var etName = etName.text.toString() // 이름 입력한 것 받아오기
        var etPhone = etPhone.text.toString() // 번호 입력한 것 받아오기
        var etEtc = etEtc.text.toString() // 기타 입력값 받아오기

        intent.putExtra("name", etName)
        intent.putExtra("phone", etPhone)
        intent.putExtra("etc", etEtc)

        when {
            rbFemale.isChecked -> {
                intent.putExtra("sex", "여성")
            }
            rbMale.isChecked -> {
                intent.putExtra("sex", "남성")
            }
        }

        Log.d(TAG, "넘길 값 이름 : $etName, 넘길 값 번호 : $etPhone, 넘길 값 기타 입력 사항 : $etEtc")

        //수강신청 과목 정보
        when {
            rbJava.isChecked -> {
                intent.putExtra("subject", "자바")
            }
            rbPython.isChecked -> {
                intent.putExtra("subject", "파이썬")
            }
            rbC.isChecked -> {
                intent.putExtra("subject", "C언어")
            }
            rbLinux.isChecked -> {
                intent.putExtra("subject", "리눅스")
            }
        }
        //수강신청 시간 정보
        when {
            rbAm.isChecked -> {
                intent.putExtra("slot", "오전")
            }
            rbPm.isChecked -> {
                intent.putExtra("slot", "오후")
            }
        }

        startActivity(intent)

    }
}