# MyFit Android
Offline-first workout tracker. No account needed. Workout logs are stored locally on your device.

## Samsung phone / GitHub instructions
1. Extract `MyFit_Android_GitHub.zip` with Samsung My Files.
2. Upload the *contents* of the extracted `myfit_android` folder to the root of a GitHub repository. Preserve `.github/workflows/android.yml` (hidden folders may need 'Show hidden system files' in My Files). GitHub's web upload may not preserve folder paths reliably on mobile: for each folder use GitHub web UI's Create new file with the desired path if necessary, or upload using a Git client that preserves folders.
3. Go to repository **Actions > Build MyFit APK > Run workflow** (or wait for the push build).
4. Open successful run > Artifacts > MyFit-debug-APK; download, unzip artifact, and install app-debug.apk. Android may ask permission to install unknown apps.

Debug APK is intended for personal testing, not Play Store publishing. Exercise demonstrations are written technique guides, not embedded videos. Data is stored in WebView localStorage; uninstalling/clearing app data deletes logs. Export backup regularly.
