package ali.khaleghi.daewooremote

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.hardware.ConsumerIrManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import io.github.inflationx.viewpump.ViewPumpContextWrapper


class MainActivity : AppCompatActivity() {

    private lateinit var btnPower: View
    private lateinit var btnMute: View
    private lateinit var btnPM: View
    private lateinit var btnSM: View
    private lateinit var btnZoom: View
    private lateinit var btnSubtitle: View
    private lateinit var btnEpg: View
    private lateinit var btnFav: View
    private lateinit var btn1: View
    private lateinit var btn2: View
    private lateinit var btn3: View
    private lateinit var btn4: View
    private lateinit var btn5: View
    private lateinit var btn6: View
    private lateinit var btn7: View
    private lateinit var btn8: View
    private lateinit var btn9: View
    private lateinit var btnReturn: View
    private lateinit var btn0: View
    private lateinit var btnTShift: View
    private lateinit var btnMenu: View
    private lateinit var btnUP: View
    private lateinit var btnSource: View
    private lateinit var btnLeft: View
    private lateinit var btnOK: View
    private lateinit var btnRight: View
    private lateinit var btnExit: View
    private lateinit var btnDown: View
    private lateinit var btnInfo: View
    private lateinit var btnVolUp: View
    private lateinit var btnChUp: View
    private lateinit var btnMedia: View
    private lateinit var btnVolDown: View
    private lateinit var btnChDown: View
    private lateinit var btnRec: View
    private lateinit var btnFreeze: View
    private lateinit var btnIII: View
    private lateinit var btnPlay: View
    private lateinit var btnPrevious: View
    private lateinit var btnNext: View
    private lateinit var btnStop: View
    private lateinit var btnRewindBack: View
    private lateinit var btnRewindForward: View
    private lateinit var btnRed: View
    private lateinit var btnGreen: View
    private lateinit var btnYellow: View
    private lateinit var btnBlue: View
    private lateinit var btnText: View
    private lateinit var btnRadio: View
    private lateinit var btnRList: View
    private lateinit var btnSleep: View

    private lateinit var btnDaewoo: View
    private lateinit var btnDevelop: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        initButtons()

    }

    private fun initViews() {
        btnPower = findViewById(R.id.btnPower)
        btnMute = findViewById(R.id.btnMute)
        btnPM = findViewById(R.id.btnPM)
        btnSM = findViewById(R.id.btnSM)
        btnZoom = findViewById(R.id.btnZoom)
        btnSubtitle = findViewById(R.id.btnSubtitle)
        btnEpg = findViewById(R.id.btnEpg)
        btnFav = findViewById(R.id.btnFav)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btnReturn = findViewById(R.id.btnReturn)
        btn0 = findViewById(R.id.btn0)
        btnTShift = findViewById(R.id.btnTShift)
        btnMenu = findViewById(R.id.btnMenu)
        btnUP = findViewById(R.id.btnUP)
        btnSource = findViewById(R.id.btnSource)
        btnLeft = findViewById(R.id.btnLeft)
        btnOK = findViewById(R.id.btnOK)
        btnRight = findViewById(R.id.btnRight)
        btnExit = findViewById(R.id.btnExit)
        btnDown = findViewById(R.id.btnDown)
        btnInfo = findViewById(R.id.btnInfo)
        btnVolUp = findViewById(R.id.btnVolUp)
        btnChUp = findViewById(R.id.btnChUp)
        btnMedia = findViewById(R.id.btnMedia)
        btnVolDown = findViewById(R.id.btnVolDown)
        btnChDown = findViewById(R.id.btnChDown)
        btnRec = findViewById(R.id.btnRec)
        btnFreeze = findViewById(R.id.btnFreeze)
        btnIII = findViewById(R.id.btnIII)
        btnPlay = findViewById(R.id.btnPlay)
        btnPrevious = findViewById(R.id.btnPrevious)
        btnNext = findViewById(R.id.btnNext)
        btnStop = findViewById(R.id.btnStop)
        btnRewindBack = findViewById(R.id.btnRewindBack)
        btnRewindForward = findViewById(R.id.btnRewindForward)
        btnRed = findViewById(R.id.btnRed)
        btnGreen = findViewById(R.id.btnGreen)
        btnYellow = findViewById(R.id.btnYellow)
        btnBlue = findViewById(R.id.btnBlue)
        btnText = findViewById(R.id.btnText)
        btnRadio = findViewById(R.id.btnRadio)
        btnRList = findViewById(R.id.btnRList)
        btnSleep = findViewById(R.id.btnSleep)

        btnDaewoo = findViewById(R.id.daewoo)
        btnDevelop = findViewById(R.id.developer)
    }

    private fun initButtons() {
        val irEngine = getSystemService(CONSUMER_IR_SERVICE) as ConsumerIrManager

        if (!irEngine.hasIrEmitter()) {
            showNotSupportingDialog()
            return
        }

        btnPower.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 560, 620, 520, 1760, 560, 1740, 540, 1740, 560, 600, 540, 600, 540, 600, 560, 600, 540, 600, 580, 1720, 600, 1700, 560, 1720, 600, 540, 640, 520, 640, 500, 640, 520, 640, 500, 620, 520, 640, 1660, 640, 1660, 640, 500, 640, 500, 640, 500, 640, 520, 640, 1640, 640, 1660, 640, 480, 660, 520, 640, 1660, 620, 1660, 640, 1660, 640, 1660, 620, 48080, 4640, 4580, 600, 1700, 580, 1
            ))
        }
        btnMute.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4700, 4520, 680, 480, 660, 1640, 640, 1660, 640, 1660, 640, 500, 640, 500, 640, 500, 660, 500, 640, 500, 640, 1660, 640, 1660, 640, 1660, 620, 520, 640, 500, 640, 500, 640, 520, 640, 1640, 640, 520, 640, 1660, 620, 1660, 640, 480, 660, 520, 640, 500, 640, 480, 680, 480, 660, 1640, 640, 520, 640, 500, 640, 1660, 640, 1640, 640, 1660, 640, 1660, 640, 48080, 4700, 4520, 660, 1640, 640, 1
            ))
        }
        btnPM.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4600, 4620, 600, 580, 540, 1760, 560, 1720, 560, 1740, 560, 560, 600, 560, 580, 540, 600, 580, 560, 600, 560, 1720, 560, 1740, 560, 1720, 560, 560, 600, 560, 580, 560, 600, 560, 580, 1700, 600, 1700, 600, 1700, 580, 560, 600, 1700, 580, 560, 580, 560, 600, 560, 580, 560, 600, 540, 600, 540, 600, 1700, 600, 540, 600, 1700, 600, 1700, 580, 1720, 580, 48140, 4640, 4600, 580, 1700, 600, 1
            ))
        }
        btnSM.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4600, 4620, 600, 540, 600, 1700, 560, 1740, 580, 1700, 600, 540, 580, 580, 580, 560, 580, 560, 600, 560, 580, 1700, 600, 1700, 600, 1700, 580, 560, 600, 540, 580, 580, 580, 560, 600, 540, 600, 560, 580, 560, 600, 1700, 560, 1720, 600, 560, 580, 560, 580, 580, 560, 1720, 560, 1740, 580, 1720, 580, 560, 580, 560, 580, 1720, 580, 1720, 580, 1700, 560, 1
            ))
        }
        btnZoom.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 600, 540, 600, 1700, 580, 1720, 580, 1700, 600, 540, 600, 560, 580, 560, 600, 540, 600, 560, 600, 1700, 580, 1700, 600, 1700, 600, 540, 600, 540, 600, 560, 580, 560, 600, 1700, 580, 1720, 580, 1720, 580, 1700, 600, 540, 580, 580, 580, 1700, 600, 560, 580, 560, 600, 560, 560, 580, 580, 560, 580, 1720, 580, 1700, 600, 560, 580, 1720, 560, 48180, 4620, 4600, 580, 1700, 580, 1
            ))
        }
        btnSubtitle.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 600, 560, 580, 1700, 600, 1700, 600, 1700, 580, 560, 580, 560, 600, 540, 600, 560, 580, 560, 600, 1700, 580, 1720, 580, 1700, 600, 560, 580, 560, 580, 560, 600, 560, 580, 560, 580, 1720, 580, 560, 600, 540, 600, 1700, 600, 1700, 580, 560, 580, 1720, 580, 1700, 600, 560, 580, 1700, 600, 1700, 600, 540, 600, 560, 580, 1720, 580, 560, 580, 48160, 4620, 4600, 580, 1700, 600, 1
            ))
        }
        btnEpg.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 580, 560, 600, 1700, 580, 1720, 580, 1700, 600, 540, 600, 560, 580, 560, 600, 540, 600, 560, 580, 1720, 580, 1700, 600, 1700, 580, 560, 600, 540, 600, 560, 580, 560, 600, 540, 600, 560, 580, 1700, 600, 560, 580, 1700, 600, 1700, 600, 540, 600, 1700, 600, 1700, 600, 1700, 580, 560, 600, 1700, 580, 560, 600, 540, 600, 1700, 580, 560, 600, 48160, 4620, 4580, 600, 1700, 580, 33144, 4640, 4580, 600, 1700, 580, 1
            ))
        }
        btnFav.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 600, 540, 600, 1700, 600, 1700, 580, 1720, 580, 560, 580, 560, 600, 540, 600, 560, 580, 560, 600, 1700, 580, 1700, 600, 1700, 600, 540, 600, 560, 580, 560, 580, 560, 600, 1700, 600, 540, 600, 1700, 580, 1720, 580, 560, 600, 1700, 580, 560, 600, 1700, 600, 540, 600, 1700, 580, 560, 600, 560, 580, 1700, 600, 540, 600, 1700, 600, 540, 600, 48140, 4640, 4580, 600, 1700, 600, 1
            ))
        }
        btn1.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 580, 560, 600, 1700, 580, 1720, 580, 1700, 600, 540, 600, 540, 600, 560, 600, 540, 600, 560, 580, 1700, 600, 1700, 600, 1700, 580, 560, 600, 540, 600, 560, 580, 560, 600, 1700, 580, 560, 600, 540, 600, 560, 580, 560, 580, 560, 600, 540, 600, 560, 600, 540, 600, 1700, 600, 1700, 580, 1700, 600, 1700, 600, 1700, 580, 1700, 600, 1700, 600, 48140, 4620, 4600, 580, 1700, 600, 1
            ))
        }
        btn2.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4640, 4600, 580, 560, 580, 1720, 580, 1700, 600, 1700, 580, 560, 600, 540, 600, 560, 580, 560, 600, 540, 600, 1700, 600, 1700, 580, 1700, 600, 560, 580, 560, 600, 540, 600, 560, 600, 540, 600, 1700, 580, 560, 600, 540, 600, 560, 580, 560, 600, 540, 600, 560, 580, 1700, 600, 560, 580, 1700, 600, 1700, 600, 1700, 580, 1700, 600, 1700, 600, 1700, 580, 48160, 4620, 4600, 580, 1700, 600, 1
            ))
        }
        btn3.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4640, 4580, 600, 540, 600, 1700, 600, 1700, 580, 1720, 580, 560, 580, 560, 600, 540, 600, 560, 600, 540, 600, 1700, 580, 1720, 580, 1700, 600, 560, 580, 560, 580, 560, 600, 540, 600, 1700, 600, 1700, 580, 560, 600, 560, 580, 560, 580, 560, 600, 540, 600, 560, 580, 560, 600, 540, 600, 1700, 580, 1720, 580, 1700, 600, 1700, 600, 1700, 580, 1720, 580, 48140, 4620, 4600, 600, 1680, 600, 1
            ))
        }
        btn4.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 580, 560, 600, 1700, 580, 1720, 580, 1700, 600, 560, 580, 540, 600, 560, 600, 540, 600, 560, 580, 1700, 600, 1700, 600, 1700, 580, 560, 600, 560, 580, 540, 600, 560, 600, 540, 600, 560, 580, 1700, 600, 560, 580, 560, 580, 560, 600, 540, 600, 560, 600, 1700, 580, 1700, 600, 560, 580, 1700, 600, 1700, 580, 1720, 580, 1700, 600, 1700, 600, 48140, 4620, 4600, 580, 1700, 600, 1
            ))
        }
        btn5.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4700, 4520, 660, 520, 620, 1680, 620, 1660, 640, 1660, 600, 540, 600, 540, 620, 540, 600, 540, 620, 540, 600, 1680, 600, 1700, 600, 1700, 600, 540, 600, 540, 600, 540, 620, 540, 600, 1700, 600, 540, 600, 1700, 600, 540, 600, 540, 600, 540, 580, 580, 600, 540, 600, 560, 600, 1680, 600, 560, 600, 1680, 620, 1680, 580, 1720, 560, 1720, 620, 1680, 580, 48140, 4600, 4620, 560, 1760, 540, 33144, 4640, 4580, 620, 1700, 600, 1
            ))
        }
        btn6.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4640, 4580, 600, 560, 580, 1740, 560, 1720, 580, 1720, 560, 560, 580, 560, 600, 560, 580, 560, 600, 540, 600, 1720, 580, 1700, 580, 1740, 560, 560, 580, 560, 580, 560, 600, 560, 580, 560, 580, 1700, 600, 1700, 600, 540, 600, 560, 580, 560, 580, 560, 600, 560, 580, 1720, 580, 560, 580, 560, 600, 1700, 580, 1700, 600, 1700, 600, 1700, 580, 1720, 580, 48140, 4640, 4580, 600, 1680, 600, 1
            ))
        }
        btn7.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4640, 4600, 560, 600, 540, 1760, 560, 1740, 560, 1720, 580, 580, 540, 600, 560, 580, 560, 600, 560, 580, 560, 1720, 580, 1720, 580, 1720, 560, 560, 580, 600, 560, 540, 580, 580, 600, 1720, 540, 1760, 560, 1720, 580, 580, 560, 560, 580, 560, 580, 560, 600, 560, 580, 560, 580, 560, 600, 540, 600, 1720, 580, 1700, 600, 1700, 560, 1720, 600, 1700, 600, 48140, 4620, 4600, 580, 1720, 580, 1
            ))
        }
        btn8.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 600, 560, 580, 1720, 560, 1740, 560, 1740, 560, 580, 560, 560, 580, 580, 580, 580, 560, 580, 580, 1720, 560, 1740, 560, 1720, 560, 560, 600, 540, 600, 560, 580, 560, 600, 580, 560, 560, 600, 540, 580, 1740, 560, 560, 580, 600, 560, 560, 580, 560, 600, 1700, 580, 1740, 560, 1740, 560, 580, 560, 1740, 560, 1720, 580, 1720, 560, 1700, 600, 48140, 4640, 4580, 600, 1700, 580, 1
            ))
        }
        btn9.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 600, 560, 580, 1720, 560, 1740, 560, 1740, 560, 580, 560, 580, 560, 560, 560, 620, 560, 560, 580, 1740, 560, 1740, 560, 1720, 560, 560, 600, 540, 600, 540, 600, 560, 600, 1720, 580, 540, 600, 540, 600, 1700, 600, 540, 600, 560, 580, 560, 600, 540, 600, 560, 580, 1700, 600, 1700, 600, 540, 600, 1700, 600, 1700, 580, 1700, 600, 1700, 600, 48140, 4640, 4580, 600, 1700, 580, 1
            ))
        }
        btnReturn.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 580, 580, 580, 1720, 540, 1760, 560, 1720, 560, 600, 540, 600, 560, 580, 560, 600, 540, 600, 560, 1740, 560, 1720, 580, 1720, 560, 560, 600, 580, 560, 580, 560, 600, 560, 1720, 560, 1740, 560, 580, 540, 1760, 560, 580, 580, 540, 600, 580, 540, 600, 560, 600, 560, 580, 560, 1740, 560, 540, 600, 1700, 600, 1720, 580, 1720, 560, 1700, 600, 48140, 4640, 4580, 600, 1700, 580, 33144, 4620, 4600, 580, 1700, 600, 1
            ))
        }
        btn0.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 600, 560, 580, 1720, 560, 1740, 560, 1720, 580, 540, 600, 560, 580, 560, 600, 540, 600, 580, 560, 1740, 560, 1740, 560, 1700, 580, 580, 580, 540, 600, 560, 580, 560, 600, 560, 580, 560, 580, 560, 580, 560, 600, 560, 580, 560, 580, 560, 580, 560, 600, 1700, 600, 1700, 580, 1720, 580, 1700, 600, 1700, 600, 1700, 580, 1700, 600, 1700, 600, 48140, 4620, 4580, 600, 1700, 600, 1
            ))
        }
        btnTShift.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 600, 560, 580, 1700, 580, 1720, 580, 1700, 600, 560, 580, 560, 580, 560, 600, 540, 600, 560, 600, 1680, 600, 1700, 600, 1700, 600, 540, 600, 540, 600, 560, 580, 560, 600, 1700, 600, 1700, 580, 1700, 600, 560, 580, 1700, 600, 1700, 600, 540, 600, 1700, 600, 560, 580, 560, 580, 560, 600, 1700, 580, 560, 600, 540, 600, 1700, 600, 540, 600, 48140, 4640, 4580, 600, 1700, 580, 1
            ))
        }
        btnMenu.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4600, 4620, 580, 600, 540, 1740, 580, 1720, 560, 1740, 560, 580, 540, 600, 580, 540, 600, 580, 560, 560, 600, 1720, 560, 1740, 560, 1740, 560, 540, 600, 560, 580, 560, 600, 540, 600, 1700, 600, 540, 600, 560, 580, 560, 600, 1700, 580, 560, 600, 540, 600, 560, 580, 560, 600, 1700, 580, 1720, 580, 1740, 560, 540, 600, 1720, 580, 1720, 560, 1740, 560, 1
            ))
        }
        btnUP.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 600, 540, 600, 1700, 600, 1700, 580, 1700, 600, 560, 580, 560, 580, 560, 600, 560, 580, 560, 600, 1700, 580, 1700, 600, 1700, 600, 540, 600, 560, 580, 560, 580, 560, 600, 560, 580, 1700, 600, 540, 600, 560, 580, 560, 600, 540, 600, 1700, 580, 580, 580, 1700, 600, 560, 580, 1700, 600, 1700, 600, 1700, 580, 1700, 600, 560, 580, 1700, 600, 48140, 4620, 4600, 600, 1700, 580, 1
            ))
        }
        btnSource.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 600, 540, 600, 1700, 600, 1700, 580, 1720, 580, 540, 620, 540, 600, 540, 600, 560, 600, 540, 600, 1700, 580, 1720, 580, 1700, 600, 540, 600, 560, 580, 560, 600, 540, 600, 1700, 600, 1700, 580, 1720, 580, 1700, 600, 540, 600, 560, 600, 540, 600, 560, 580, 560, 580, 560, 600, 540, 600, 560, 580, 1720, 580, 1700, 600, 1700, 600, 1700, 580, 48140, 4700, 4520, 660, 1660, 640, 1
            ))
        }
        btnLeft.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4640, 4600, 580, 580, 560, 1740, 560, 1740, 560, 1720, 560, 600, 560, 580, 560, 580, 560, 600, 560, 560, 560, 1740, 580, 1700, 600, 1720, 540, 600, 560, 560, 600, 580, 560, 580, 560, 560, 600, 540, 600, 1720, 580, 540, 600, 560, 580, 560, 580, 1720, 580, 560, 600, 1700, 580, 1720, 580, 560, 600, 1700, 580, 1700, 600, 1700, 600, 540, 600, 1700, 600, 48140, 4620, 4600, 580, 1700, 600, 1
            ))
        }
        btnOK.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 600, 540, 600, 1720, 560, 1720, 580, 1700, 600, 540, 600, 560, 600, 540, 600, 560, 580, 560, 580, 1720, 580, 1700, 600, 1700, 600, 540, 600, 540, 600, 560, 580, 560, 600, 540, 600, 1700, 600, 1700, 600, 540, 600, 560, 580, 560, 580, 1700, 600, 560, 600, 1700, 580, 560, 580, 560, 600, 1700, 580, 1700, 600, 1700, 600, 540, 600, 1700, 600, 48140, 4620, 4600, 580, 1720, 580, 1
            ))
        }
        btnRight.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4640, 4600, 580, 560, 580, 1740, 560, 1700, 600, 1700, 600, 540, 600, 560, 580, 560, 600, 540, 600, 560, 580, 1740, 560, 1700, 600, 1720, 560, 560, 600, 560, 580, 540, 600, 560, 600, 1700, 580, 560, 600, 1720, 560, 560, 600, 540, 600, 540, 600, 1700, 600, 560, 600, 540, 580, 1720, 580, 560, 600, 1700, 580, 1700, 600, 1700, 600, 540, 600, 1700, 600, 48140, 4620, 4600, 600, 1700, 580, 1
            ))
        }
        btnExit.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4600, 4620, 580, 600, 540, 1760, 540, 1740, 540, 1760, 540, 600, 540, 620, 560, 580, 540, 600, 580, 580, 560, 1720, 600, 1700, 600, 1700, 600, 520, 620, 540, 600, 540, 640, 520, 640, 1660, 640, 500, 640, 1660, 620, 500, 660, 1660, 640, 1640, 640, 520, 640, 1660, 640, 500, 640, 1660, 620, 520, 640, 1660, 640, 480, 660, 500, 640, 1660, 640, 500, 640, 1
            ))
        }
        btnDown.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 600, 540, 600, 1700, 600, 1700, 580, 1720, 580, 560, 580, 560, 600, 540, 600, 560, 600, 540, 580, 1720, 580, 1720, 580, 1700, 600, 540, 600, 560, 580, 560, 600, 540, 600, 1700, 600, 1700, 580, 560, 600, 540, 600, 560, 580, 560, 580, 1700, 600, 560, 600, 540, 600, 560, 580, 1700, 600, 1700, 600, 1700, 580, 1700, 600, 560, 580, 1720, 580, 48140, 4640, 4580, 600, 1700, 580, 1
            ))
        }
        btnInfo.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 580, 560, 580, 1720, 580, 1700, 600, 1700, 600, 540, 600, 540, 600, 560, 580, 560, 600, 560, 580, 1700, 600, 1700, 600, 1700, 580, 560, 600, 540, 600, 540, 600, 560, 580, 560, 600, 1700, 580, 1700, 600, 560, 600, 1700, 580, 560, 580, 560, 580, 580, 580, 1700, 600, 560, 580, 560, 600, 1680, 600, 560, 600, 1700, 580, 1700, 600, 1700, 600, 48140, 4640, 4580, 600, 1700, 580, 1
            ))
        }
        btnVolUp.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 600, 540, 600, 1700, 600, 1700, 580, 1700, 600, 560, 580, 560, 580, 560, 600, 560, 580, 560, 600, 1680, 600, 1700, 600, 1700, 600, 540, 600, 560, 580, 560, 580, 560, 600, 540, 600, 560, 600, 1680, 600, 560, 600, 1700, 580, 560, 580, 560, 600, 560, 580, 1700, 600, 1700, 600, 540, 600, 1700, 580, 560, 600, 1700, 580, 1720, 580, 1700, 600, 48160, 4620, 4580, 600, 1700, 600, 33124, 4640, 4580, 600, 1680, 600, 1
            ))
        }
        btnChUp.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 580, 560, 580, 1720, 580, 1700, 600, 1700, 600, 540, 600, 540, 600, 560, 600, 540, 600, 560, 580, 1700, 600, 1700, 600, 1700, 580, 560, 600, 540, 600, 540, 600, 560, 600, 540, 600, 1700, 600, 540, 600, 560, 580, 1700, 600, 540, 600, 560, 580, 560, 600, 1700, 600, 540, 600, 1700, 600, 1700, 580, 560, 600, 1700, 580, 1700, 600, 1700, 600, 48140, 4620, 4600, 600, 1700, 580, 1
            ))
        }
        btnMedia.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4600, 4620, 600, 560, 560, 1720, 580, 1720, 560, 1740, 560, 580, 580, 560, 600, 560, 580, 560, 600, 540, 580, 1720, 600, 1700, 580, 1700, 600, 560, 580, 560, 580, 560, 600, 560, 580, 1700, 600, 560, 580, 1700, 600, 1700, 600, 1700, 580, 560, 600, 540, 600, 560, 600, 540, 600, 1700, 600, 540, 600, 540, 600, 560, 580, 1700, 600, 1700, 600, 1700, 580, 48140, 4680, 4560, 660, 1640, 640, 1
            ))
        }
        btnVolDown.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 580, 560, 600, 1700, 580, 1720, 580, 1700, 600, 540, 600, 560, 580, 560, 600, 540, 600, 560, 580, 1700, 600, 1700, 600, 1700, 580, 560, 600, 540, 600, 560, 580, 560, 600, 1700, 580, 560, 600, 1700, 580, 560, 600, 1700, 580, 560, 600, 540, 600, 560, 580, 560, 600, 1700, 580, 560, 600, 1700, 580, 560, 600, 1700, 580, 1700, 600, 1700, 600, 48140, 4620, 4600, 580, 1720, 580, 1
            ))
        }
        btnChDown.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4700, 4520, 680, 500, 640, 1640, 660, 1640, 640, 1660, 640, 480, 660, 520, 640, 480, 660, 480, 660, 500, 660, 1640, 640, 1660, 640, 1660, 640, 480, 660, 480, 660, 520, 620, 500, 660, 1640, 660, 1640, 640, 480, 680, 480, 660, 1660, 620, 500, 660, 480, 660, 480, 680, 480, 660, 500, 640, 1660, 640, 1640, 620, 520, 620, 1680, 640, 1660, 620, 1680, 620, 48100, 4700, 4520, 660, 1640, 620, 1
            ))
        }
        btnRec.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 600, 540, 600, 1700, 600, 1700, 580, 1700, 600, 560, 580, 560, 580, 560, 600, 560, 580, 560, 600, 1680, 600, 1700, 600, 1700, 600, 540, 600, 560, 580, 560, 580, 560, 600, 1700, 600, 540, 600, 540, 600, 560, 600, 1680, 600, 1700, 600, 560, 580, 1720, 580, 560, 580, 1700, 600, 1700, 600, 1700, 580, 560, 600, 540, 600, 1700, 600, 560, 580, 48140, 4640, 4600, 580, 1700, 600, 1
            ))
        }
        btnFreeze.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4640, 4600, 580, 580, 560, 1740, 560, 1740, 560, 1720, 580, 540, 600, 540, 600, 580, 560, 600, 560, 580, 560, 1740, 560, 1720, 540, 1760, 560, 560, 580, 580, 580, 580, 540, 580, 600, 560, 580, 1720, 540, 580, 560, 1760, 540, 1760, 540, 600, 540, 600, 560, 600, 540, 1760, 560, 580, 560, 1740, 580, 540, 620, 540, 600, 1700, 600, 1680, 640, 1660, 640, 48080, 4620, 4600, 580, 1740, 560, 1
            ))
        }
        btnIII.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4700, 4520, 680, 500, 640, 1640, 640, 1660, 640, 1660, 640, 500, 640, 500, 640, 520, 640, 500, 640, 500, 640, 1660, 640, 1660, 600, 1700, 600, 540, 600, 520, 660, 500, 600, 560, 600, 540, 600, 540, 620, 1680, 600, 1700, 560, 580, 600, 1700, 600, 540, 580, 1720, 580, 1720, 540, 1760, 560, 580, 540, 600, 560, 1740, 560, 580, 540, 1760, 540, 600, 580, 48140, 4620, 4580, 600, 1720, 580, 1
            ))
        }
        btnPlay.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4600, 4620, 620, 540, 640, 1660, 640, 1660, 640, 1640, 640, 520, 640, 500, 640, 500, 640, 520, 640, 500, 640, 1660, 640, 1640, 640, 1660, 640, 500, 640, 520, 640, 500, 640, 500, 640, 1660, 640, 500, 640, 520, 640, 1640, 640, 520, 640, 500, 640, 1660, 640, 500, 640, 500, 640, 1660, 640, 1660, 640, 500, 640, 1660, 640, 1660, 640, 480, 660, 1660, 640, 48080, 4700, 4500, 680, 1640, 640, 1
            ))
        }
        btnPrevious.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4700, 4520, 680, 500, 640, 1640, 660, 1640, 640, 1660, 640, 500, 640, 480, 660, 500, 660, 480, 660, 500, 660, 1640, 640, 1660, 640, 1660, 640, 480, 660, 480, 660, 480, 680, 500, 640, 500, 640, 500, 660, 460, 680, 480, 660, 500, 640, 520, 620, 1660, 640, 520, 640, 1660, 640, 1640, 640, 1660, 640, 1660, 640, 1640, 640, 1660, 640, 500, 640, 1660, 640, 48060, 4720, 4500, 680, 1640, 660, 1
            ))
        }
        btnNext.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4640, 4580, 600, 580, 560, 1740, 560, 1740, 560, 1720, 560, 580, 580, 580, 560, 560, 580, 560, 600, 540, 600, 1700, 600, 1700, 580, 1700, 600, 560, 600, 540, 600, 540, 600, 560, 620, 1680, 580, 560, 580, 560, 600, 540, 600, 560, 580, 560, 600, 1680, 600, 560, 600, 540, 600, 1700, 600, 1700, 580, 1720, 580, 1700, 600, 1700, 600, 540, 600, 1700, 580, 48160, 4620, 4600, 580, 1720, 580, 1
            ))
        }
        btnStop.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4700, 4520, 660, 500, 640, 1660, 640, 1660, 640, 1640, 660, 480, 660, 500, 640, 500, 640, 520, 640, 500, 640, 1660, 640, 1640, 660, 1640, 640, 500, 660, 500, 640, 480, 660, 520, 620, 500, 660, 1660, 620, 500, 660, 1640, 640, 520, 640, 500, 640, 1660, 640, 500, 640, 1660, 640, 500, 640, 1660, 640, 480, 660, 1660, 640, 1660, 620, 520, 640, 1660, 620, 48100, 4700, 4520, 640, 1660, 620, 1
            ))
        }
        btnRewindBack.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4600, 4620, 600, 580, 540, 1740, 580, 1720, 560, 1740, 560, 580, 540, 600, 580, 560, 560, 600, 540, 600, 560, 1740, 580, 1720, 560, 1740, 560, 580, 560, 580, 580, 560, 600, 560, 560, 1720, 600, 1700, 600, 1700, 600, 540, 580, 580, 600, 540, 600, 1680, 620, 540, 600, 540, 600, 560, 600, 540, 600, 1700, 600, 1680, 600, 1700, 600, 540, 600, 1700, 620, 1
            ))
        }
        btnRewindForward.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4660, 4560, 600, 580, 560, 1720, 540, 1760, 540, 1760, 540, 600, 540, 600, 580, 560, 580, 580, 540, 580, 580, 1740, 540, 1760, 560, 1740, 560, 540, 600, 580, 560, 560, 600, 540, 600, 560, 580, 560, 560, 580, 600, 1700, 580, 560, 600, 540, 600, 1700, 600, 540, 600, 1700, 600, 1700, 600, 1700, 580, 560, 600, 1700, 580, 1700, 600, 560, 580, 1700, 600, 48140, 4640, 4580, 600, 1700, 580, 1
            ))
        }
        btnRed.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4640, 4580, 620, 560, 600, 1680, 640, 1660, 640, 1660, 640, 500, 640, 500, 640, 500, 620, 540, 640, 500, 640, 1660, 640, 1640, 660, 1640, 640, 520, 640, 500, 640, 480, 660, 520, 640, 480, 660, 500, 640, 520, 620, 520, 640, 500, 640, 1660, 640, 500, 640, 1660, 640, 1660, 620, 1660, 640, 1660, 640, 1660, 640, 1640, 640, 520, 620, 1660, 640, 520, 600, 48100, 4640, 4580, 600, 1720, 580, 1
            ))
        }
        btnGreen.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4600, 4620, 600, 560, 580, 1740, 520, 1760, 560, 1720, 580, 560, 600, 540, 600, 540, 600, 560, 580, 560, 600, 1700, 580, 1740, 560, 1700, 600, 540, 600, 560, 580, 560, 600, 560, 580, 1700, 600, 560, 580, 560, 580, 560, 600, 540, 600, 1700, 600, 540, 600, 1700, 600, 560, 580, 1700, 600, 1720, 580, 1700, 580, 1700, 600, 540, 600, 1700, 600, 560, 580, 1
            ))
        }
        btnYellow.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4700, 4520, 660, 520, 640, 1640, 640, 1660, 640, 1660, 640, 500, 640, 500, 640, 480, 660, 500, 660, 500, 640, 1660, 640, 1640, 660, 1640, 640, 520, 620, 520, 640, 500, 640, 520, 640, 480, 660, 1640, 660, 500, 640, 480, 660, 480, 660, 1660, 640, 500, 640, 1660, 640, 1660, 640, 500, 640, 1660, 640, 1640, 660, 1640, 640, 480, 660, 1660, 640, 520, 620, 1
            ))
        }
        btnBlue.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 600, 540, 600, 1700, 580, 1720, 580, 1700, 600, 540, 600, 560, 600, 540, 600, 560, 580, 560, 580, 1720, 580, 1700, 600, 1700, 600, 540, 600, 540, 600, 560, 580, 560, 600, 1700, 580, 1720, 580, 560, 580, 560, 600, 540, 600, 1700, 600, 540, 600, 1700, 600, 560, 560, 580, 580, 1720, 580, 1700, 600, 1700, 580, 560, 600, 1700, 580, 560, 560, 48180, 4600, 4620, 580, 1700, 560, 1
            ))
        }
        btnText.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4620, 560, 600, 540, 1760, 540, 1740, 580, 1720, 580, 580, 560, 540, 580, 600, 560, 600, 560, 580, 560, 1720, 580, 1720, 580, 1720, 560, 560, 560, 580, 600, 540, 600, 560, 580, 1720, 580, 1700, 600, 540, 600, 1700, 600, 540, 600, 1700, 600, 540, 600, 1700, 600, 560, 580, 560, 600, 1680, 600, 560, 600, 1680, 600, 560, 580, 1700, 600, 560, 580, 48140, 4640, 4580, 600, 1700, 580, 1
            ))
        }
        btnRadio.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4620, 4600, 600, 560, 580, 1700, 600, 1700, 600, 1700, 580, 560, 600, 540, 600, 540, 600, 560, 600, 540, 600, 1700, 600, 1700, 580, 1700, 600, 560, 580, 560, 600, 540, 600, 560, 600, 540, 580, 560, 600, 1700, 600, 540, 600, 1700, 600, 540, 600, 1700, 600, 540, 600, 1700, 600, 1700, 580, 560, 600, 1700, 580, 560, 600, 1700, 580, 560, 600, 1700, 580, 48160, 4600, 4620, 580, 1740, 540, 1
            ))
        }
        btnRList.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4700, 4520, 660, 480, 660, 1660, 640, 1660, 640, 1640, 660, 480, 660, 480, 660, 480, 680, 480, 660, 500, 640, 1660, 640, 1660, 640, 1640, 640, 500, 660, 480, 660, 480, 660, 520, 620, 1660, 640, 1660, 640, 480, 660, 520, 640, 1640, 640, 480, 680, 1640, 640, 520, 640, 480, 660, 500, 640, 1660, 640, 1660, 620, 500, 660, 1660, 620, 500, 660, 1660, 600, 48120, 4660, 4540, 640, 1680, 620, 1
            ))
        }
        btnSleep.setOnClickListener {
            vibrate()
            irEngine.transmit(38000, intArrayOf(
                    4700, 4520, 660, 500, 640, 1660, 640, 1660, 640, 1660, 640, 500, 640, 500, 640, 500, 640, 520, 640, 480, 660, 1660, 640, 1660, 640, 1640, 640, 500, 660, 500, 640, 500, 640, 500, 660, 480, 660, 1640, 640, 1660, 640, 1660, 640, 500, 640, 480, 680, 460, 680, 480, 660, 1660, 640, 480, 660, 480, 660, 500, 660, 1640, 640, 1660, 640, 1660, 640, 1660, 620, 48080, 4700, 4520, 660, 1660, 640, 1
            ))
        }
        btnDaewoo.setOnClickListener { openGithub() }
        btnDevelop.setOnClickListener { openGithub() }
    }

    private fun showNotSupportingDialog() {
        AlertDialog.Builder(this@MainActivity)
                .setTitle(getString(R.string.warning))
                .setMessage(getString(R.string.ir_not_supported))
                .setPositiveButton(getString(R.string.exit_app)) { _, _ ->
                    finish()
                }
                .setNegativeButton(getString(R.string.close), null)
                .show()
    }

    private fun vibrate(durationInMillis: Long = 20) {
        val v = getSystemService(VIBRATOR_SERVICE) as Vibrator
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            v.vibrate(VibrationEffect.createOneShot(durationInMillis, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            //deprecated in API 26
            v.vibrate(durationInMillis)
        }
    }

    private fun openGithub() {
        val url = "https://github.com/alikhaleghi76"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase))
    }
}