---
title: "com.hypixel.hytale.server.core"
kind: "package"
package: "com.hypixel.hytale.server.core"
fqcn: "com.hypixel.hytale.server.core"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "core"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core`

Root package for the Hytale server core. Contains the main server class, configuration, command-line options, shutdown lifecycle, the rich text message system, and name matching utilities.

## Types

| Type | Kind | Description |
|---|---|---|
| [Constants](Constants.md) | class | Server-wide constants and core plugin manifest list. |
| [HytaleServer](HytaleServer.md) | class | Main server class managing the full lifecycle. |
| [HytaleServerConfig](HytaleServerConfig.md) | class | Server configuration loaded from `config.json`. |
| [Message](Message.md) | class | Rich text message with i18n, parameters, and styling. |
| [NameMatching](NameMatching.md) | enum | Name matching strategies for entity/player lookup. |
| [Options](Options.md) | class | Command-line option definitions. |
| [ShutdownReason](ShutdownReason.md) | class | Shutdown reason with exit code and message. |
