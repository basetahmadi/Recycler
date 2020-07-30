package com.example.android.trackmysleepquality

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android.trackmysleepquality.database.SleepNight
import com.example.android.trackmysleepquality.sleeptracker.SleepNightAdapter


@BindingAdapter("sleepNightItems")
fun RecyclerView.sleepNightItems(items: List<SleepNight>?) {
    items?.let {
        (adapter as SleepNightAdapter).submitList(items)
    }
}



/*
import com.bumptech.glide.Glide
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.load.model.LazyHeaders
import com.separ.App
import com.separ.Event
import com.separ.R
import com.separ.data.models.Accident
import com.separ.data.models.Document
import com.separ.data.models.ImageItem
import com.separ.main.announce.imagepicker.ImageAdapter
import com.separ.main.followdemand.detail.ImageAdapterDetail


@BindingAdapter("imageItems")
fun RecyclerView.imageItems(images: List<ImageItem>?) {
    (adapter as ImageAdapter).addHeaderAndSubmitList(images)
}

@BindingAdapter("imageItemsDetail")
fun RecyclerView.imageItemsDetail(images: List<Document>?) {
    (adapter as ImageAdapterDetail).submitList(images)
}


@BindingAdapter("imageUri")
fun ImageView.imageUri(uri: Uri?) {
    uri?.let {
        setImageURI(it)
    }
}

@BindingAdapter("exposedMenuList")
fun AutoCompleteTextView.exposedMenuList(items: List<String>?) {
    items?.let {
        val adapter = ArrayAdapter(context, R.layout.list_item_exposed_menu, it)
        setAdapter(adapter)
    }
}

@BindingAdapter("errorMessage")
fun TextInputLayout.errorMessage(
    event: Event<String>?
) {
    event?.getContentIfNotHandled()?.let { message ->
        error = message
        return
    }
    error = null
}

@BindingAdapter("fullAddress")
fun TextView.fullAddress(item: Accident?) {
    item?.let {
        val t1 = item.city + " - " + "منطقه " + item.district + " - " // city with distinct
        val fullText = t1 + item.address // full address
        val s = SpannableString(fullText)
        s.setSpan(
            ForegroundColorSpan(ContextCompat.getColor(context, R.color.colorPrimary)),
            0,
            t1.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        setText(s, TextView.BufferType.SPANNABLE)
    }
}

@BindingAdapter("isOwnerVisibility")
fun View.isOwnerVisibility(item: Accident?) {
    item?.let {
        visibility = if (item.participants?.firstOrNull { it.isClaimant!! }!!.isOwner) View.VISIBLE
        else View.GONE
    }

}

@BindingAdapter("imageUrl")
fun ImageView.imageUrl(imgUrl: String?) {
    imgUrl?.let {
        */
/*val auth = "Authorization"
        val glideUrl = GlideUrl(
            it,
            LazyHeaders.Builder().addHeader(auth, "Token ${App.token}").build()
        )*//*

        Glide.with(context)
            .load(it + "?Authorization=Token ${App.token}")
            .into(this)
    }
}

fun View.showSnackbar(snackbarText: String, timeLength: Int) {
    Snackbar.make(this, snackbarText, timeLength).run {
        show()
    }
}

fun View.setupSnackbar(
    lifecycleOwner: LifecycleOwner,
    snackbarEvent: LiveData<Event<String>>,
    timeLength: Int
) {

    snackbarEvent.observe(lifecycleOwner, Observer { event ->
        event.getContentIfNotHandled()?.let {
            showSnackbar(it, timeLength)
        }
    })
}

fun String.persianToEnglish(): String {
    val chars = CharArray(length)
    for (i in 0 until length) {
        var ch: Char = get(i)
        if (ch.toInt() in 0x0660..0x0669)
            ch -= 0x0660 - '0'.toInt()
        else if (ch.toInt() in 0x06f0..0x06F9) ch -= 0x06f0 - '0'.toInt()
        chars[i] = ch
    }
    return String(chars)
}
*/

