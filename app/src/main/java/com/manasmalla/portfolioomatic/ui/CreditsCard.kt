package com.manasmalla.portfolioomatic.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Constraints
import com.manasmalla.portfolioomatic.R


@Composable
fun CreditsCard() {
    Layout(modifier = Modifier.fillMaxWidth(), content = {
        Image(
            painterResource(R.drawable.credits_image),
            contentDescription = null,contentScale = ContentScale.FillHeight
        )
        Image(
            painterResource(id = R.drawable.credits_text), contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
    }) { measurables, constraints ->

        val textMeasurable = measurables.last()
        val imageMeasurable = measurables.first()
        val textPlaceable = textMeasurable.measure(constraints.copy(maxWidth = (constraints.maxWidth * 0.66).toInt(), minWidth = 0))
        val imagePlaceable = imageMeasurable.measure(Constraints(maxHeight = textPlaceable.height))
        layout(constraints.maxWidth, textPlaceable.height){
            var margin = (constraints.maxWidth - (textPlaceable.width + imagePlaceable.width + 16))/2
            imagePlaceable.placeRelative(margin, 0)
            textPlaceable.placeRelative(36 + imagePlaceable.width + margin,0)
        }
    }
}

