---
title: "Expression"
kind: "class"
package: "com.hypixel.hytale.server.npc.util.expression"
fqcn: "com.hypixel.hytale.server.npc.util.expression.Expression"
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

```java
public class Expression
```

Entry point for the NPC expression evaluator. An `Expression` instance owns a `CompileContext` and an [ExecutionContext](ExecutionContext.md) and provides methods to compile expression strings into instruction lists, execute pre-compiled instructions, or evaluate an expression in a single call. The compile step uses a `Lexer<Token>` shared across all instances.

## Fields

| Modifier | Type | Name | Description |
|---|---|---|---|
| `private static final` | `Lexer<Token>` | `lexer` | Shared lexer instance for tokenizing expression strings. |
| `@Nonnull private final` | [ExecutionContext](ExecutionContext.md) | `executionContext` | Execution context obtained from the compile context. |
| `@Nonnull private final` | `CompileContext` | `compileContext` | Compile context for parsing and type-checking expressions. |

## Constructors

| Signature |
|---|
| `public Expression()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | [ValueType](ValueType.md) | `compile(@Nonnull String expression, Scope scope, @Nonnull List<ExecutionContext.Instruction> instructions, boolean fullResolve)` |
| `public` | [ValueType](ValueType.md) | `compile(@Nonnull String expression, Scope compileScope, @Nonnull List<ExecutionContext.Instruction> instructions)` |
| `@Nonnull public` | [ExecutionContext](ExecutionContext.md) | `execute(@Nonnull List<ExecutionContext.Instruction> instructions, Scope scope)` |
| `@Nonnull public` | [ExecutionContext](ExecutionContext.md) | `execute(@Nonnull ExecutionContext.Instruction[] instructions, Scope scope)` |
| `@Nonnull public` | [ExecutionContext](ExecutionContext.md) | `evaluate(@Nonnull String expression, Scope scope)` |
| `public static` | [ValueType](ValueType.md) | `compileStatic(@Nonnull String expression, Scope scope, @Nonnull List<ExecutionContext.Instruction> instructions)` |
| `@Nonnull public static` | `Lexer<Token>` | `getLexerInstance()` |

## Usage

`compile()` parses an expression string into a list of `ExecutionContext.Instruction` objects and returns the result type. `execute()` runs a pre-compiled instruction list against a [Scope](Scope.md). `evaluate()` combines both steps for one-shot evaluation. The `fullResolve` parameter in the four-argument `compile` overload controls whether the compiler resolves all symbols at compile time.

## Related Types

- [ExecutionContext](ExecutionContext.md) -- the stack VM that runs compiled instructions
- [Scope](Scope.md) -- provides variable bindings and functions
- [ValueType](ValueType.md) -- result type discriminant
