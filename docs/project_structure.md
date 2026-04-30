# Project Structure

## Root Directory
- `README.md` - Project overview and documentation
- `LICENSE` - GPL-3.0 license file
- `build.gradle.kts` - Root build configuration
- `settings.gradle.kts` - Project settings
- `.gitignore` - Git ignore rules

## App Directory (`stack-vpn-app/app`)
- `build.gradle.kts` - App build configuration

### Source Code (`stack-vpn-app/app/src/main/kotlin/com/example/vpn`)
- `MainActivity.kt` - Main application entry point
- `core/` - Core functionality components
- `service/` - VPN service implementation
- `protocols/` - Protocol engine implementations
- `ui/` - User interface components
- `utils/` - Utility classes

### Resources (`stack-vpn-app/app/src/main`)
- `AndroidManifest.xml` - Application manifest

## Documentation (`stack-vpn-app/docs`)
- `user_guide.md` - User instructions
- `release_notes.md` - Version release information
- `security.md` - Security documentation
- `performance.md` - Performance optimization documentation
- `security_audit_report.md` - Security audit results
- `release_checklist.md` - Release preparation checklist

## Testing (`stack-vpn-app/app/src/test` and `stack-vpn-app/app/src/androidTest`)
- Unit tests for core components
- Instrumentation tests for Android-specific functionality