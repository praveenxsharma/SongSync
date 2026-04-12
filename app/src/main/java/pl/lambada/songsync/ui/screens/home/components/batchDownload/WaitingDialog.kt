package pl.lambada.songsync.ui.screens.home.components.batchDownload

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import pl.lambada.songsync.R

@Composable
fun WaitingDialog(
    secondsRemaining: Int,
    onCancel: () -> Unit
) {
    AlertDialog(
        title = {
            Text(text = stringResource(id = R.string.batch_download_lyrics))
        },
        text = {
            Column {
                Text(text = stringResource(R.string.spotify_api_rate_limit_reached))
                Text(text = stringResource(R.string.resuming_in, secondsRemaining))
            }
        },
        onDismissRequest = { /* Prevent accidental dismiss */ },
        confirmButton = { /* Empty but required */ },
        dismissButton = {
            OutlinedButton(onClick = onCancel) {
                Text(text = stringResource(R.string.cancel))
            }
        }
    )
}
