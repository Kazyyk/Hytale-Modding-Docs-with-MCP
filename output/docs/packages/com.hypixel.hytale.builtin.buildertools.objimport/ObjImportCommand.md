---
title: "ObjImportCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.objimport"
fqcn: "com.hypixel.hytale.builtin.buildertools.objimport.ObjImportCommand"
api_surface: false
extends: "AbstractPlayerCommand"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builder-tools"
  - "obj-import"
  - "command"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.objimport`

```java
public class ObjImportCommand extends AbstractPlayerCommand
```

Server command (`/importobj`, alias `/obj`) that opens the OBJ import UI page for the executing player. Requires Creative game mode and the `hytale.editor.selection.clipboard` permission.

## Constructor

```java
public ObjImportCommand()
```

Registers the command with name `"importobj"`, alias `"obj"`, Creative permission group, and clipboard permission.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `execute(CommandContext, Store, Ref, PlayerRef, World)` | `void` | Opens an `ObjImportPage` for the player. |

## See Also

- [ObjImportPage](ObjImportPage.md)
