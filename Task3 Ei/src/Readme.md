# Global Configurations for Online Learning Platform

## Overview

This project implements a Singleton Pattern to manage global configurations for an Online Learning Platform. The configuration manager ensures that API keys, database connections, and file storage paths are initialized only once during the application's lifecycle, promoting efficient resource management.

## Features

- **Singleton Pattern**: Ensures only one instance of the configuration manager exists.
- **Global Access**: Provides a centralized way to access configuration settings throughout the application.
- **Thread-Safe Initialization**: Ensures that the singleton instance is safely initialized in a multi-threaded environment.

## Installation

To set up the Global Configurations Manager, follow these steps:

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd ConfigManager
