package dev.itsmeow.betteranimalsplus.client.model.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.itsmeow.betteranimalsplus.client.model.abstracts.ModelBAP;
import dev.itsmeow.betteranimalsplus.common.entity.EntityDeer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.LivingEntity;

/**
 * deer_2 - cybercat5555 Created using Tabula 7.0.1
 */
public class ModelDeer<T extends LivingEntity> extends ModelBAP<T> {
    public ModelPart body;
    public ModelPart ass;
    public ModelPart chest;
    public ModelPart lForeleg01;
    public ModelPart rForeleg01;
    public ModelPart lHindLeg01;
    public ModelPart rHindLeg01;
    public ModelPart tail;
    public ModelPart lHindLeg02;
    public ModelPart lHindLeg03;
    public ModelPart lHindHoof;
    public ModelPart rHindLeg02;
    public ModelPart rHindLeg03;
    public ModelPart rHindHoof;
    public ModelPart neck;
    public ModelPart mane03;
    public ModelPart mane04;
    public ModelPart head;
    public ModelPart mane01;
    public ModelPart mane02;
    public ModelPart snout;
    public ModelPart upperJaw;
    public ModelPart lEar;
    public ModelPart rEar;
    public ModelPart throat;
    public ModelPart lAntler01;
    public ModelPart rAntler01;
    public ModelPart lowerJaw;
    public ModelPart lAntler02;
    public ModelPart lAntler01b;
    public ModelPart lAntler03;
    public ModelPart lAntler04;
    public ModelPart lAntler03b;
    public ModelPart lAntler04b;
    public ModelPart lAntler05;
    public ModelPart lAntler06;
    public ModelPart lAntler07;
    public ModelPart lAntler06b;
    public ModelPart lAntler08;
    public ModelPart lAntler07b;
    public ModelPart lAntler08b;
    public ModelPart lAntler08c;
    public ModelPart rAntler02;
    public ModelPart rAntler01b;
    public ModelPart rAntler03;
    public ModelPart rAntler04;
    public ModelPart rAntler03b;
    public ModelPart rAntler04b;
    public ModelPart rAntler05;
    public ModelPart rAntler06;
    public ModelPart rAntler07;
    public ModelPart rAntler06b;
    public ModelPart rAntler08;
    public ModelPart rAntler07b;
    public ModelPart rAntler08b;
    public ModelPart rAntler08c;
    public ModelPart lForeleg02;
    public ModelPart lForeleg03;
    public ModelPart lForeHoof;
    public ModelPart rForeleg02;
    public ModelPart rForeleg03;
    public ModelPart rForeHoof;

    public ModelDeer(ModelPart root) {
        this.body = root.getChild("body");
        this.ass = body.getChild("ass");
        this.lHindLeg01 = ass.getChild("lHindLeg01");
        this.lHindLeg02 = lHindLeg01.getChild("lHindLeg02");
        this.lHindLeg03 = lHindLeg02.getChild("lHindLeg03");
        this.lHindHoof = lHindLeg03.getChild("lHindHoof");
        this.rHindLeg01 = ass.getChild("rHindLeg01");
        this.rHindLeg02 = rHindLeg01.getChild("rHindLeg02");
        this.rHindLeg03 = rHindLeg02.getChild("rHindLeg03");
        this.rHindHoof = rHindLeg03.getChild("rHindHoof");
        this.tail = ass.getChild("tail");
        this.chest = body.getChild("chest");
        this.neck = chest.getChild("neck");
        this.head = neck.getChild("head");
        this.snout = head.getChild("snout");
        this.upperJaw = head.getChild("upperJaw");
        this.lEar = head.getChild("lEar");
        this.rEar = head.getChild("rEar");
        this.throat = head.getChild("throat");
        this.lowerJaw = throat.getChild("lowerJaw");
        this.lAntler01 = head.getChild("lAntler01");
        this.lAntler02 = lAntler01.getChild("lAntler02");
        this.lAntler03 = lAntler02.getChild("lAntler03");
        this.lAntler04 = lAntler03.getChild("lAntler04");
        this.lAntler04b = lAntler04.getChild("lAntler04b");
        this.lAntler05 = lAntler04.getChild("lAntler05");
        this.lAntler06 = lAntler05.getChild("lAntler06");
        this.lAntler06b = lAntler06.getChild("lAntler06b");
        this.lAntler07 = lAntler05.getChild("lAntler07");
        this.lAntler08 = lAntler07.getChild("lAntler08");
        this.lAntler08b = lAntler08.getChild("lAntler08b");
        this.lAntler08c = lAntler08.getChild("lAntler08c");
        this.lAntler07b = lAntler07.getChild("lAntler07b");
        this.lAntler03b = lAntler03.getChild("lAntler03b");
        this.lAntler01b = lAntler01.getChild("lAntler01b");
        this.rAntler01 = head.getChild("rAntler01");
        this.rAntler02 = rAntler01.getChild("rAntler02");
        this.rAntler03 = rAntler02.getChild("rAntler03");
        this.rAntler04 = rAntler03.getChild("rAntler04");
        this.rAntler04b = rAntler04.getChild("rAntler04b");
        this.rAntler05 = rAntler04.getChild("rAntler05");
        this.rAntler06 = rAntler05.getChild("rAntler06");
        this.rAntler06b = rAntler06.getChild("rAntler06b");
        this.rAntler07 = rAntler05.getChild("rAntler07");
        this.rAntler08 = rAntler07.getChild("rAntler08");
        this.rAntler08b = rAntler08.getChild("rAntler08b");
        this.rAntler08c = rAntler08.getChild("rAntler08c");
        this.rAntler07b = rAntler07.getChild("rAntler07b");
        this.rAntler03b = rAntler03.getChild("rAntler03b");
        this.rAntler01b = rAntler01.getChild("rAntler01b");
        this.mane01 = neck.getChild("mane01");
        this.mane02 = neck.getChild("mane02");
        this.mane03 = chest.getChild("mane03");
        this.mane04 = chest.getChild("mane04");
        this.lForeleg01 = body.getChild("lForeleg01");
        this.lForeleg02 = lForeleg01.getChild("lForeleg02");
        this.lForeleg03 = lForeleg02.getChild("lForeleg03");
        this.lForeHoof = lForeleg03.getChild("lForeHoof");
        this.rForeleg01 = body.getChild("rForeleg01");
        this.rForeleg02 = rForeleg01.getChild("rForeleg02");
        this.rForeleg03 = rForeleg02.getChild("rForeleg03");
        this.rForeHoof = rForeleg03.getChild("rForeHoof");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 13).addBox(-4.0F, -3.5F, 0.0F, 8.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, -9.0F));
        PartDefinition ass = body.addOrReplaceChild("ass", CubeListBuilder.create().texOffs(0, 34).addBox(-3.5F, -3.5F, 0.0F, 7.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 12.3F, -0.1745F, 0.0F, 0.0F));
        PartDefinition lHindLeg01 = ass.addOrReplaceChild("lHindLeg01", CubeListBuilder.create().texOffs(46, 0).addBox(0.0F, -1.9F, -2.0F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, -0.4F, 2.9F, -0.2269F, 0.0F, 0.0F));
        PartDefinition lHindLeg02 = lHindLeg01.addOrReplaceChild("lHindLeg02", CubeListBuilder.create().texOffs(48, 15).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 5.0F, -1.1F, 0.9076F, 0.0F, 0.0F));
        PartDefinition lHindLeg03 = lHindLeg02.addOrReplaceChild("lHindLeg03", CubeListBuilder.create().texOffs(45, 26).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 5.8F, 0.3F, -0.4887F, 0.0F, 0.0F));
        PartDefinition lHindHoof = lHindLeg03.addOrReplaceChild("lHindHoof", CubeListBuilder.create().texOffs(32, 20).addBox(-1.5F, 0.0F, -2.4F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.2F, 0.39F));
        PartDefinition rHindLeg01 = ass.addOrReplaceChild("rHindLeg01", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-3.0F, -1.9F, -2.0F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -0.5F, 2.9F, -0.2269F, 0.0F, 0.0F));
        PartDefinition rHindLeg02 = rHindLeg01.addOrReplaceChild("rHindLeg02", CubeListBuilder.create().texOffs(48, 15).mirror().addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 5.0F, -1.1F, 0.9076F, 0.0F, 0.0F));
        PartDefinition rHindLeg03 = rHindLeg02.addOrReplaceChild("rHindLeg03", CubeListBuilder.create().texOffs(45, 26).mirror().addBox(-1.0F, -0.3F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 5.8F, 0.3F, -0.4887F, 0.0F, 0.0F));
        PartDefinition rHindHoof = rHindLeg03.addOrReplaceChild("rHindHoof", CubeListBuilder.create().texOffs(32, 20).mirror().addBox(-1.5F, 0.0F, -2.4F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 6.2F, 0.39F));
        PartDefinition tail = ass.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(54, 25).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7F, 5.4F, 0.576F, 0.0F, 0.0F));
        PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -3.0F, -5.0F, 7.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 2.4F, -0.8378F, 0.0F, 0.0F));
        PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(26, 37).addBox(-2.5F, -2.5F, -6.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.4F, -3.0F, -0.3142F, 0.0F, 0.0F));
        PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(46, 39).addBox(-2.5F, -3.0F, -4.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1F, -5.0F, -0.3142F, 0.0F, 0.0F));
        PartDefinition snout = head.addOrReplaceChild("snout", CubeListBuilder.create().texOffs(54, 31).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -3.1F, 0.3491F, 0.0F, 0.0F));
        PartDefinition upperJaw = head.addOrReplaceChild("upperJaw", CubeListBuilder.create().texOffs(19, 57).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.3F, -1.0F));
        PartDefinition lEar = head.addOrReplaceChild("lEar", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-1.0F, -0.7F, -3.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.1F, -1.0F, -3.0F, 0.2793F, -1.0821F, 0.0F));
        PartDefinition rEar = head.addOrReplaceChild("rEar", CubeListBuilder.create().texOffs(21, 0).addBox(-1.0F, -0.7F, -3.1F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, -1.0F, -3.0F, 0.2793F, 1.0821F, 0.0F));
        PartDefinition throat = head.addOrReplaceChild("throat", CubeListBuilder.create().texOffs(41, 48).addBox(-2.0F, 0.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.2F, -0.49F));
        PartDefinition lowerJaw = throat.addOrReplaceChild("lowerJaw", CubeListBuilder.create().texOffs(52, 48).addBox(-2.0F, 0.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));
        PartDefinition lAntler01 = head.addOrReplaceChild("lAntler01", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5F, -0.5F, -3.9F, 0.0F, -0.2618F, 0.2618F));
        PartDefinition lAntler02 = lAntler01.addOrReplaceChild("lAntler02", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-0.5F, -0.4F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.1F, 0.0F, -0.5236F, 0.0F, 0.0F));
        PartDefinition lAntler03 = lAntler02.addOrReplaceChild("lAntler03", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-0.5F, -0.5F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.5F, -1.4F, -0.4887F, -0.2269F, 0.0F));
        PartDefinition lAntler04 = lAntler03.addOrReplaceChild("lAntler04", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-0.5F, -0.5F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, -2.6F, 0.4538F, 0.2269F, 0.0F));
        PartDefinition lAntler04b = lAntler04.addOrReplaceChild("lAntler04b", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -2.8F, 0.4014F, 0.3491F, 0.0F));
        PartDefinition lAntler05 = lAntler04.addOrReplaceChild("lAntler05", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1F, -0.3F, -0.8029F, -0.2269F, 0.0F));
        PartDefinition lAntler06 = lAntler05.addOrReplaceChild("lAntler06", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-0.5F, -0.5F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.8727F, 0.2269F, 0.0F));
        PartDefinition lAntler06b = lAntler06.addOrReplaceChild("lAntler06b", CubeListBuilder.create().texOffs(2, 21).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -2.8F, 0.3142F, 0.4538F, 0.0F));
        PartDefinition lAntler07 = lAntler05.addOrReplaceChild("lAntler07", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -3.8F, 0.0F, 0.4887F, 0.0F));
        PartDefinition lAntler08 = lAntler07.addOrReplaceChild("lAntler08", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -2.8F, -0.3142F, 0.6109F, 0.0F));
        PartDefinition lAntler08b = lAntler08.addOrReplaceChild("lAntler08b", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -0.7F, 0.7854F, 0.4014F, 0.0F));
        PartDefinition lAntler08c = lAntler08.addOrReplaceChild("lAntler08c", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, 0.2F, -0.3491F, -0.6109F, -1.2217F));
        PartDefinition lAntler07b = lAntler07.addOrReplaceChild("lAntler07b", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-0.5F, -0.5F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.8727F, 0.0F, 0.7854F));
        PartDefinition lAntler03b = lAntler03.addOrReplaceChild("lAntler03b", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-0.5F, -0.5F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -1.3F, 1.3963F, -0.9599F, 0.0F));
        PartDefinition lAntler01b = lAntler01.addOrReplaceChild("lAntler01b", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -1.2F, 0.9599F, -0.6981F, 0.3142F));
        PartDefinition rAntler01 = head.addOrReplaceChild("rAntler01", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.5F, -3.9F, 0.0F, 0.2618F, -0.2618F));
        PartDefinition rAntler02 = rAntler01.addOrReplaceChild("rAntler02", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.4F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.1F, 0.0F, -0.5236F, 0.0F, 0.0F));
        PartDefinition rAntler03 = rAntler02.addOrReplaceChild("rAntler03", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.5F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -1.4F, -0.4887F, 0.2269F, 0.0F));
        PartDefinition rAntler04 = rAntler03.addOrReplaceChild("rAntler04", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.5F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -2.6F, 0.4538F, -0.2269F, 0.0F));
        PartDefinition rAntler04b = rAntler04.addOrReplaceChild("rAntler04b", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.8F, 0.4014F, -0.3491F, 0.0F));
        PartDefinition rAntler05 = rAntler04.addOrReplaceChild("rAntler05", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.3F, -0.8029F, 0.2269F, 0.0F));
        PartDefinition rAntler06 = rAntler05.addOrReplaceChild("rAntler06", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.5F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.8727F, -0.2269F, 0.0F));
        PartDefinition rAntler06b = rAntler06.addOrReplaceChild("rAntler06b", CubeListBuilder.create().texOffs(2, 21).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.8F, 0.3142F, -0.4538F, 0.0F));
        PartDefinition rAntler07 = rAntler05.addOrReplaceChild("rAntler07", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.8F, 0.0F, -0.4887F, 0.0F));
        PartDefinition rAntler08 = rAntler07.addOrReplaceChild("rAntler08", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.8F, -0.3142F, -0.6109F, 0.0F));
        PartDefinition rAntler08b = rAntler08.addOrReplaceChild("rAntler08b", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.7F, 0.7854F, -0.4014F, 0.0F));
        PartDefinition rAntler08c = rAntler08.addOrReplaceChild("rAntler08c", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 0.2F, -0.3491F, 0.6109F, 1.2217F));
        PartDefinition rAntler07b = rAntler07.addOrReplaceChild("rAntler07b", CubeListBuilder.create().texOffs(0, 19).addBox(-0.5F, -0.5F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.8727F, 0.0F, -0.7854F));
        PartDefinition rAntler03b = rAntler03.addOrReplaceChild("rAntler03b", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.5F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.3F, 1.3963F, 0.9599F, 0.0F));
        PartDefinition rAntler01b = rAntler01.addOrReplaceChild("rAntler01b", CubeListBuilder.create().texOffs(0, 12).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.2F, 0.9599F, 0.6981F, -0.3142F));
        PartDefinition mane01 = neck.addOrReplaceChild("mane01", CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, -4.0F, -0.5411F, 0.0F, 0.0F));
        PartDefinition mane02 = neck.addOrReplaceChild("mane02", CubeListBuilder.create().texOffs(0, 56).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7F, -2.2F, -0.5411F, 0.0F, 0.0F));
        PartDefinition mane03 = chest.addOrReplaceChild("mane03", CubeListBuilder.create().texOffs(17, 48).addBox(-3.0F, -0.1F, -0.1F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8F, -4.7F, -0.6981F, 0.0F, 0.0F));
        PartDefinition mane04 = chest.addOrReplaceChild("mane04", CubeListBuilder.create().texOffs(36, 54).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -3.1F, -0.6109F, 0.0F, 0.0F));
        PartDefinition lForeleg01 = body.addOrReplaceChild("lForeleg01", CubeListBuilder.create().texOffs(29, 0).addBox(-1.0F, -2.4F, -2.5F, 3.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 0.9F, 2.3F, 0.1396F, 0.0F, -0.0873F));
        PartDefinition lForeleg02 = lForeleg01.addOrReplaceChild("lForeleg02", CubeListBuilder.create().texOffs(31, 13).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 4.4F, 0.1F, 0.0F, 0.0F, 0.0873F));
        PartDefinition lForeleg03 = lForeleg02.addOrReplaceChild("lForeleg03", CubeListBuilder.create().texOffs(45, 26).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 2.7F, 0.0F, -0.1396F, 0.0F, 0.0F));
        PartDefinition lForeHoof = lForeleg03.addOrReplaceChild("lForeHoof", CubeListBuilder.create().texOffs(32, 20).addBox(-1.5F, 0.0F, -2.4F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.3F, 0.4F));
        PartDefinition rForeleg01 = body.addOrReplaceChild("rForeleg01", CubeListBuilder.create().texOffs(29, 0).mirror().addBox(-2.0F, -2.4F, -2.5F, 3.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 0.9F, 2.3F, 0.1396F, 0.0F, 0.0873F));
        PartDefinition rForeleg02 = rForeleg01.addOrReplaceChild("rForeleg02", CubeListBuilder.create().texOffs(31, 13).mirror().addBox(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 4.4F, 0.1F, 0.0F, 0.0F, -0.0873F));
        PartDefinition rForeleg03 = rForeleg02.addOrReplaceChild("rForeleg03", CubeListBuilder.create().texOffs(45, 26).mirror().addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.7F, 0.0F, -0.1396F, 0.0F, 0.0F));
        PartDefinition rForeHoof = rForeleg03.addOrReplaceChild("rForeHoof", CubeListBuilder.create().texOffs(32, 20).mirror().addBox(-1.5F, 0.0F, -2.4F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 7.3F, 0.4F));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.quadriped(lHindLeg01, rHindLeg01, lForeleg01, rForeleg01, limbSwing * 0.666F, limbSwingAmount * 1.4F);
        this.headYaw(head, netHeadYaw, 0.5F, 0F);
        if (entity instanceof EntityDeer) {
            EntityDeer deer = (EntityDeer) entity;
            float eatTime = deer.getEatTime();
            if (eatTime > 0) {
                this.chest.xRot = rad(15F);
                this.neck.xRot = rad(40F);
                this.head.xRot = rad(-65F);
                this.lowerJaw.xRot = rad(eatTime % 20F) + 0.1F;
            } else {
                this.chest.xRot = -0.6829473363053812F;
                this.neck.xRot = headPitch * 0.017453292F - 0.31869712141416456F;
                this.head.xRot = -0.31869712141416456F;
                this.lowerJaw.xRot = 0F;
            }
        }
        this.headPitch(head, headPitch, 1F, -13F);
    }

}
