<div align="center">

# 🛡️ CyberShield — Network Security Management System

![Java](https://shields.io)
![OOP](https://shields.io)
![University](https://shields.io)

**A modular, console-based Java application simulating core cybersecurity operations through clean Object-Oriented Programming (OOP) architecture.**

</div>

---

## 🎓 Academic & Team Details
* **👨‍💻 Developed By:**
  * **Dost Ali** — Roll No: `2k26/CSM/26` ([@dostali-netsec](https://github.com))
  * **Zamin Ali** — Roll No: `2k26/CSM/137`
* **📚 Course:** Object-Oriented Programming (Java) — 2nd Semester
* **🏛️ Institution:** University of Sindh, Jamshoro

---

## 📌 Project Overview
**CyberShield** is a menu-driven security management system designed to demonstrate how real-world cybersecurity modules interact within a unified framework. Users can monitor live system health, toggle firewall protection, inspect incoming network traffic, scan system files for threats, and generate instant security reports.

---

## ✨ Key Features
* **📊 Live Security Dashboard:** Displays real-time operational status (`ACTIVE`, `PROTECTED`, `DISABLED`) of all integrated security modules.
* **🔥 Firewall Management System:** Enables or disables network protection dynamically and filters incoming connections by flagging `unknown` or `suspicious` sources.
* **🦠 Antivirus File Scanner:** Scans system files, detects potential malware (`unknown_attachment.exe`), and tracks total scanned items alongside detected threats.
* **🖧 Unified Node Monitoring:** Uses polymorphic arrays (`SecurityNode[]`) to inspect all security nodes uniformly from a single interface.
* **📑 Automated Security Report:** Summarizes firewall state, scan counts, and threat statistics in one click.

---

## 🧠 Object-Oriented Programming (OOP) Concepts Implemented

| OOP Pillar | Implementation in CyberShield |
| :--- | :--- |
| **Encapsulation** | Private attributes (`nodeId`, `nodeName`, `active`, `firewallEnabled`) in `SecurityNode` and child classes are accessed safely via public getter and action methods. |
| **Inheritance** | `FirewallSystem` and `AntivirusScanner` extend the base `SecurityNode` class using `extends` and `super()`, eliminating code duplication. |
| **Polymorphism** | Method overriding (`@Override displayStatus()`) provides custom status outputs per module, while `SecurityNode[]` manages diverse objects at runtime. |
| **Abstraction** | `SecurityNode` defines a generalized blueprint for any security node within the system. |

---

## 📂 Project Structure
```text
CyberShield/
├── SecurityNode.java       # Parent/Base class defining common security node properties
├── FirewallSystem.java     # Child class managing firewall controls & traffic inspection
├── AntivirusScanner.java   # Child class handling file scanning & threat detection
├── CyberShieldMain.java    # Main entry point with interactive CLI menu (Scanner)
└── README.md               # Project documentation
```

---

## 🚀 How to Compile & Run

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/CyberShield.git
   cd CyberShield
   ```

2. **Compile All Java Files:**
   ```bash
   javac *.java
   ```

3. **Run the Application:**
   ```bash
   java CyberShieldMain
   ```

---

## 🖥️ Sample Console Output
```text
================================
       CYBERSHIELD SYSTEM
   CYBER SECURITY MANAGEMENT
================================

========== MAIN MENU ==========
1. Security Dashboard
2. Firewall Management
3. Antivirus Scanner
4. Security Node Status
5. Security Report
0. Exit

Enter your choice: 1

===== SECURITY DASHBOARD =====
Firewall Status: PROTECTED
Antivirus Status: ACTIVE
```

---

<div align="center">
  Developed with 💻 in Java by <b>Dost Ali (2k26/CSM/26)</b> & <b>Zamin Ali (2k26/CSM/137)</b> | University of Sindh
</div>
