package com.chukcha.smilemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SmileBlock extends Block {

    public SmileBlock() {
        super(Properties
            .create(Material.IRON)
            .sound(SoundType.METAL)
            .hardnessAndResistance(2.0f)
            .lightValue(14)
        );

        setRegistryName("smileblock");
    }
}
