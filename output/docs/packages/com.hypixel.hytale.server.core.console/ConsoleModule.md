---
title: "ConsoleModule"
kind: "class"
package: "com.hypixel.hytale.server.core.console"
fqcn: "com.hypixel.hytale.server.core.console.ConsoleModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "console"
---

**Package:** `com.hypixel.hytale.server.core.console`

```java
public class ConsoleModule extends JavaPlugin
```

Server module providing core functionality.

## Fields

| Field | Type | Description |
|---|---|---|
| `instance` | `ConsoleModule` | Static ConsoleModule field. |
| `terminal` | `Terminal` | Static Terminal field. |
| `consoleRunnable` | `ConsoleModule.ConsoleRunnable` | ConsoleModule.ConsoleRunnable field. |

## Constructors

| Constructor | Description |
|---|---|
| `ConsoleModule(@Nonnull JavaPluginInit init)` | Creates a new ConsoleModule instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `get()` | `ConsoleModule` | static public method. |
| `initializeTerminal()` | `void` | static public method. |
| `setup()` | `void` | protected method. |
| `shutdown()` | `void` | protected method. |
| `getTerminal()` | `Terminal` | public method. |
