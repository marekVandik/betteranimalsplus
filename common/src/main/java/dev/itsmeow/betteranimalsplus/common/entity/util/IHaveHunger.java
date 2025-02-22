package dev.itsmeow.betteranimalsplus.common.entity.util;

import dev.itsmeow.imdlib.entity.interfaces.IContainerEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.nbt.CompoundTag;

public interface IHaveHunger<T extends Mob> extends IContainerEntity<T> {

    int getHunger();

    void setHunger(int hunger);

    default void writeHunger(CompoundTag nbt) {
        nbt.putInt("Hunger", getHunger());
    }

    default void readHunger(CompoundTag nbt) {
        setHunger(nbt.getInt("Hunger"));
    }

    default int getHungerThreshold() {
        return 80;
    }

    default int getEffectiveHunger() {
        return Math.max(0, getHunger() - getHungerThreshold());
    }

    default int getInitialHunger() {
        return 10 + getImplementation().getRandom().nextInt(50);
    }

    default void setInitialHunger() {
        setHunger(getInitialHunger());
    }

    default int getHungerResetValue() {
        return getImplementation().getRandom().nextInt(20);
    }

    default void resetHunger() {
        setHunger(getHungerResetValue());
    }

    default void incrementHunger() {
        setHunger(getHunger() + 1);
    }
}
