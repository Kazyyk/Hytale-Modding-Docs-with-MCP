# Expression

Type: class | Package: com.hypixel.hytale.server.npc.util.expression

public class Expression

Entry point for the NPC expression evaluator. An `Expression` instance owns a `CompileContext` and an ExecutionContext and provides methods to compile expression strings into instruction lists, execute pre-compiled instructions, or evaluate an expression in a single call. The compile step uses a `Lexer<Token>` shared across all instances.

## Fields

- private static final Lexer<Token> lexer
- @Nonnull private final ExecutionContext executionContext
- @Nonnull private final CompileContext compileContext

## Constructors

- public Expression()

## Methods

- public ValueType compile(@Nonnull String expression, Scope scope, @Nonnull List<ExecutionContext.Instruction> instructions, boolean fullResolve)
- public ValueType compile(@Nonnull String expression, Scope compileScope, @Nonnull List<ExecutionContext.Instruction> instructions)
- @Nonnull public ExecutionContext execute(@Nonnull List<ExecutionContext.Instruction> instructions, Scope scope)
- @Nonnull public ExecutionContext execute(@Nonnull ExecutionContext.Instruction[] instructions, Scope scope)
- @Nonnull public ExecutionContext evaluate(@Nonnull String expression, Scope scope)
- public static ValueType compileStatic(@Nonnull String expression, Scope scope, @Nonnull List<ExecutionContext.Instruction> instructions)
- @Nonnull public static Lexer<Token> getLexerInstance()

## Usage

`compile()` parses an expression string into a list of `ExecutionContext.Instruction` objects and returns the result type. `execute()` runs a pre-compiled instruction list against a Scope. `evaluate()` combines both steps for one-shot evaluation. The `fullResolve` parameter in the four-argument `compile` overload controls whether the compiler resolves all symbols at compile time.

## Related Types

- ExecutionContext -- the stack VM that runs compiled instructions
- Scope -- provides variable bindings and functions
- ValueType -- result type discriminant
