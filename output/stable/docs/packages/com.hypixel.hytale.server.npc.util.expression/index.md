---
title: "com.hypixel.hytale.server.npc.util.expression"
kind: "package"
package: "com.hypixel.hytale.server.npc.util.expression"
fqcn: "com.hypixel.hytale.server.npc.util.expression"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "expression"
  - "scripting"
---

**Package:** `com.hypixel.hytale.server.npc.util.expression`

Runtime expression evaluator used by the NPC behavior system. Expressions in NPC role JSON assets (e.g. dynamic numeric or boolean values) are compiled into stack-based instruction sequences and executed against a `Scope` that provides variable bindings and functions. The system supports numbers, strings, booleans, and typed arrays, with a standard library of math and utility functions.

## Types

| Type | Kind | Description |
|---|---|---|
| [Expression](Expression.md) | class | Entry point for compiling and executing expression strings. |
| [ExecutionContext](ExecutionContext.md) | class | Stack-based virtual machine that executes compiled instruction sequences. |
| [Scope](Scope.md) | interface | Contract for variable and function providers used during compilation and execution. |
| [StdScope](StdScope.md) | class | Symbol-table-backed scope implementation with parent chain resolution. |
| [StdLib](StdLib.md) | class | Singleton standard library scope providing built-in constants and functions. |
| [ValueType](ValueType.md) | enum | Discriminant for the eight value types the expression system supports. |
