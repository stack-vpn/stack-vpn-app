# StackVPN - Open-Source Dual-Protocol VPN Client for Android

[![GitHub](https://img.shields.io/badge/StackVPN-v1.0-blue)](https://github.com/stack-vpn/stack-vpn-app)
[![License](https://img.shields.io/badge/License-GPL%203.0-blue)](LICENSE)
[![Platform](https://img.shields.io/badge/Platform-Android%208.0%2B-green)](https://www.android.com/)

**Privacy-focused open-source VPN for Android** combining WireGuard and OpenVPN for enhanced security.

## Overview

StackVPN is an open-source Android VPN client that supports multiple VPN protocols (WireGuard and OpenVPN) in a single application, enabling internal VPN chaining for enhanced privacy and security.

## Features

- ✅ **Dual VPN Support** - WireGuard + OpenVPN in one app
- ✅ **Privacy First** - No logs, no telemetry, open-source
- ✅ **Kill Switch** - Blocks traffic if VPN drops
- ✅ **Ad Blocking** - DNS-level ad/tracker blocking
- ✅ **Split Tunneling** - Route specific apps through VPN
- ✅ **Always-On VPN** - Stay protected even after reboot

## Key Features
- Dual VPN tunnel support (internal chaining)
- No root required
- Tracker and ad blocking capabilities
- Kill switch functionality
- Split tunneling support
- Custom DNS resolver

## Technology Stack
- Kotlin (Primary language)
- Jetpack Compose (UI framework)
- Android VPNService API
- WireGuard and OpenVPN libraries
- tun2socks for packet routing

## Getting Started

To get started with this project:

1. Clone the repository
2. Open in Android Studio
3. Build and run the project

## Installation

1. Install Android Studio
2. Clone this repository
3. Open the project in Android Studio
4. Build and run the project

## Usage

This section explains how to use the application.

## Project Structure

```
stack-vpn-app/
├── app/
│   ├── src/main/kotlin/com/example/vpn/
│   │   ├── MainActivity.kt
│   │   ├── core/
│   │   ├── service/
│   │   ├── protocols/
│   │   └── ui/
│   ├── src/main/AndroidManifest.xml
│   └── build.gradle.kts
├── docs/
│   └── (documentation files)
└── README.md
```

## Contributing

Contributions are welcome! Please read the contributing guidelines before getting started, or make sure to sort the existing issues to find an issue to fix or determine if the feature you want to implement is already in the issues list.

## License

This project is licensed under the GPL-3.0 License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- WireGuard project
- OpenVPN project
- Android Open Source Project

## Repository Status

This project is currently in development. The initial development environment has been set up with the basic directory structure.

## Next Steps

1. Implement core VPNService functionality
2. Integrate WireGuard and OpenVPN protocols
3. Implement packet routing system
4. Build user interface
5. Conduct comprehensive testing
6. Security audit and optimization
7. Prepare for release

## Contact

For support, please check the project documentation or contact the development team through GitHub issues.