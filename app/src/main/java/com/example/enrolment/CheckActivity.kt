package com.example.enrolment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_check.*

class CheckActivity : AppCompatActivity() {

    val TAG: String = "jeongmin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check)

        checkInf()
    }

    private fun checkInf() {
        Log.d(TAG, "전 화면에서 넘어온 값 이름 : " + intent.getStringExtra("name"))
        Log.d(TAG, "전 화면에서 넘어온 값 번호 : " + intent.getStringExtra("phone"))
        Log.d(TAG, "전 화면에서 넘어온 선택값 성별 : " + intent.getStringExtra("sex"))

        Log.d(TAG, "전 화면에서 넘어온 선택값 과목 : " + intent.getStringExtra("subject"))
        Log.d(TAG, "전 화면에서 넘어온 시간 선택 : " + intent.getStringExtra("slot"))
        Log.d(TAG, "전 화면에서 넘어온 기타사항 : " + intent.getStringExtra("etc"))
        tvApplicantName.text = intent.getStringExtra("name")
        tvApplicantPhone.text = intent.getStringExtra("phone")
        tvApplicantSex.text = intent.getStringExtra("sex")

        tvApplicantSubject.text = intent.getStringExtra("subject")
        tvApplicantSlot.text = intent.getStringExtra("slot")
        tvApplicantEtc.text = intent.getStringExtra("etc")

        when {
            intent.getStringExtra("subject").equals("자바") -> {
                iv.setImageResource(R.drawable.java)
            }
            intent.getStringExtra("subject").equals("파이썬") -> {
                iv.setImageResource(R.drawable.python)
            }
            intent.getStringExtra("subject").equals("C언어") -> {
                iv.setImageResource(R.drawable.c)
            }
            intent.getStringExtra("subject").equals("리눅스") -> {
                iv.setImageResource(R.drawable.linux)
            }
        }
    }
}