---
title: "UpdateSetupCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.update.command"
fqcn: "com.hypixel.hytale.server.core.update.command.UpdateSetupCommand"
api_surface: false
extends: "CommandBase"
generator_version: "2.0.0"
generated_at: "2026-03-22T00:00:00Z"
tags:
  - "commands"
  - "update"
  - "server-management"
---

**Package:** `com.hypixel.hytale.server.core.update.command`

```java
public class UpdateSetupCommand extends CommandBase
```

Server command that extracts wrapper startup scripts (`start.sh` and `start.bat`) from the server JAR to the parent directory. Validates that the server is running from a JAR, optionally checks that the working directory is named `"Server"`, and supports a `--force` flag to overwrite existing scripts.

## Constructor

```java
public UpdateSetupCommand()
```

Registers as `"setup"` with description key `"server.commands.update.setup.desc"`.

## Fields

| Field | Type | Description |
|---|---|---|
| `forceFlag` | `FlagArg` | Optional `--force` flag to bypass directory name and overwrite checks. |

## Key Methods

| Method | Return Type | Description |
|---|---|---|
| `executeSync(CommandContext)` | `void` | Validates preconditions, extracts `start.sh` and `start.bat`, sets executable permission on Unix, warns if `Assets.zip` is missing. |

## Validation Order

1. Checks `ManifestUtil.isJar()` -- rejects if not running from a JAR.
2. Checks working directory name equals `"Server"` (skipped with `--force`).
3. Checks if `start.sh` or `start.bat` already exist (skipped with `--force`).
