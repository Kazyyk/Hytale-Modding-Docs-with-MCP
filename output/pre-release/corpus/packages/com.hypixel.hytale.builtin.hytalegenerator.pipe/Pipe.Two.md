# Pipe.Two

Type: interface | Package: com.hypixel.hytale.builtin.hytalegenerator.pipe

@FunctionalInterface
public interface Two<InputA, InputB>

Functional interface for a dual-input pipe callback. Receives two input values and a Control for signaling early termination.

## Abstract Methods

- accept | void | @Nonnull InputA var1, @Nonnull InputB var2, @Nonnull Control var3