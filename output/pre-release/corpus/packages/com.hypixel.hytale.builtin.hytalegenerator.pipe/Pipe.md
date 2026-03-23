# Pipe

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.pipe

public class Pipe

Provides functional callback interfaces for the world-generation pipeline with Control-based flow control. Contains singleton no-op instances (`EMPTY_ONE`, `EMPTY_TWO`) and factory methods for type-safe empty pipe retrieval.

## Inner Types

- Pipe.One | interface
- Pipe.Two | interface

## Fields

- public static final Pipe.One<?> EMPTY_ONE
- public static final Pipe.Two<?, ?> EMPTY_TWO

## Methods

- public static <Input> Pipe.One<Input> getEmptyOne()
- public static <InputA, InputB> Pipe.Two<InputA, InputB> getEmptyTwo()
