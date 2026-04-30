
# StackVPN - Open-Source Dual-Protocol VPN for Android

[![GitHub](https://img.shields.io/badge/GitHub-stack--vpn%2Fstack--vpn--app-blue?logo=github)](https://github.com/stack-vpn/stack-vpn-app)
[![License](https://img.shields.io/badge/License-GPL%203.0-blue)](LICENSE)
[![GitHub stars](https://img.shields.io/github/stars/stack-vpn/stack-vpn-app?style=social)](https://github.com/stack-vpn/stack-vpn-app/stargazers)
[![Android](https://img.shields.io/badge/Android-8.0%2B-green?logo=android)](https://www.android.com/)

**Privacy-focused open-source VPN for Android** combining WireGuard and OpenVPN for multi-layer encryption.

![StackVPN Demo](docs/images/demo.gif)

## Why StackVPN?

Android limits you to **one VPN at a time**. Want to use DuckDuckGo tracking protection + Proton VPN together? You can't.

**StackVPN solves this** by stacking multiple VPN protocols in one app—no root required.

### ⚡ Key Features

- ✅ **Dual VPN Support** - WireGuard + OpenVPN in one app
- ✅ **No Root Required** - Works on stock Android
- ✅ **Privacy First** - No logs, no telemetry, open-source
- ✅ **Kill Switch** - Blocks traffic if VPN disconnects
- ✅ **Ad Blocking** - DNS-level ad/tracker blocking
- ✅ **Split Tunneling** - Route specific apps through VPN
- ✅ **Always-On VPN** - Stay protected even after reboot
- ✅ **Custom DNS** - Use your own DNS resolver

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


## 📊 How It Works

```
Your Device
    ↓
[VPNService - Single TUN Interface]
    ↓
[Internal Tunnel Manager]
├─ WireGuard Engine (Protocol 1)
├─ OpenVPN Engine (Protocol 2)
└─ Packet Router (intelligently routes)
    ↓
[DNS Filter - Blocks ads/trackers]
    ↓
[Kill Switch - Blocks if disconnected]
    ↓
Encrypted Connection
    ↓
Internet (Double encrypted if using both tunnels)
```

## 🛠️ Development

### Requirements

- Android Studio (latest)
- Android SDK 8.0+ (API 26+)
- NDK (for OpenVPN C++ code)
- Kotlin 1.9+
- Gradle 8.0+


### Project Structure

See [docs/architecture.md](docs/architecture.md) for detailed architecture.

## 📚 Documentation

- **[Architecture](docs/architecture.md)** - System design & components
- **[Setup Guide](docs/setup.md)** - Development environment setup
- **[Building](docs/building.md)** - How to build the app
- **[Contributing](CONTRIBUTING.md)** - How to contribute
- **[Security](docs/security.md)** - Security practices
- **[VPN Protocols](docs/protocol.md)** - WireGuard vs OpenVPN

## 🤝 Contributing

We welcome contributions! See [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines.

### Ways to Help

- 🐛 Report bugs via [GitHub Issues](https://github.com/stack-vpn/stack-vpn-app/issues)
- 💡 Suggest features
- 📝 Improve documentation
- 🔍 Security audits
- 💻 Submit pull requests
- 🗣️ Join community discussions

## 🔒 Privacy & Security

- **No Logging** - We never record your activity
- **Open Source** - Audit the code yourself
- **Kill Switch** - Blocks traffic if VPN drops
- **DNS Filtering** - Blocks ads/trackers at DNS level
- **Regular Audits** - Security reviews by third parties

See [docs/security.md](docs/security.md) for security details.

## 📋 Roadmap

### Phase 1  - MVP
- ✅ VPNService skeleton
- ✅ WireGuard integration
- ✅ OpenVPN integration
- ✅ Basic UI
- ✅ Profile management
- ✅ Kill switch

### Phase 2 - Features
- Ad/tracker blocking (DNS filtering)
- Split tunneling
- Always-on VPN
- Custom DNS
- IPv6 support

### Phase 3  - Polish
- Performance optimization
- Security audit
- F-Droid release
- Community growth
- Sponsorship program

### Phase 4 - Expansion
- iOS version (potential)
- VPN server infrastructure
- Premium managed service (optional)
- Browser extension

## 📊 Project Stats

- **Language:** Kotlin, Java, C/C++
- **License:** GPL-3.0
- **Minimum Android:** 8.0 (API 26)
- **Status:** Active Development
- **Maintainers:** [Team]
- **Contributors:** Growing community

## 💬 Community

- **GitHub Discussions** - Ask questions, share ideas
- **GitHub Issues** - Report bugs, request features
- **Matrix Chat** - Real-time community chat (coming soon)
- **Reddit** - r/stackvpn (coming soon)

## 📄 License

StackVPN is licensed under [GPL-3.0](LICENSE). This means:
- ✅ You can use it freely
- ✅ You can modify and redistribute
- ✅ Must keep it open-source
- ✅ Must credit original authors

## ⚠️ Disclaimer

StackVPN is provided as-is. We make no guarantees about:
- Perfect privacy (no system is 100% secure)
- Unbreakable encryption (security research evolves)
- Specific performance (depends on servers/network)

Always research VPN security practices and keep your device updated.

## 🙏 Thanks

- [WireGuard](https://www.wireguard.com/) - Modern VPN protocol
- [OpenVPN](https://openvpn.net/) - Mature VPN implementation
- [Android Open Source Project](https://source.android.com/) - VPNService API
- Community contributors

## 📞 Contact

- **Project Issues:** [GitHub Issues](https://github.com/stack-vpn/stack-vpn-app/issues)
- **Email:** d33kshith@duck.com
- **Security Issues:** d33kshith@duck.com

---

**Made with ❤️ for privacy**

*Last Updated: April 30, 2026*
