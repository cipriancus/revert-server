# revert-server

```text
POST: localhost:8080/patients or https://revert-server-android.herokuapp.com/patients
BODY:
{
    "patient_id": "0000119",
    "age": 67,
    "chemo_exposure": 1,
    "fraction_genome_altered": 0.2312,
    "gene_panel": 341,
    "mCRC_type": 39,
    "metastasectomy": 0,
    "metastases_site_first_bone": 0,
    "metastases_site_first_brain": 0,
    "metastases_site_first_gynecological": 0,
    "metastases_site_first_liver": 1,
    "metastases_site_first_ln": 0,
    "metastases_site_first_lung": 0,
    "metastases_site_first_pelvis": 0,
    "metastases_site_first_peritoneum_omentum_abdomen": 1,
    "metastatic_biopsy_site": 6,
    "msi_score": 0.72,
    "msi_status": 0,
    "mutation_count": 9,
    "overall_survival_months": 27.37,
    "living_status": 1,
    "other_metastasis_sites": 0,
    "patient_tumor_grade": 68,
    "primary_tumor_site": 71,
    "primary_tumor_location": 80,
    "sample_type": 81,
    "sex": 83,
    "specimen_type": 85,
    "stage_at_diagnostic": 4.0,
    "time_from_met_dx_to_sequencing": 38.93333333,
    "time_to_81_months": 0
}

Collumns not used:
    "metastasectomy_site"
    "first_site_of_metastasis"

We do not support negative values.

Value translation:
        NA = 0
        Lung = 1
        Liver = 2
        Peritoneum = 3
        Lymph Nodes = 4
        Iliac = 5
        Ovary, Ovaries = 6
        Bone = 7
        Omentum = 8
        Soft Tissue = 9
        Skin = 10
        Rectovaginal Fistula = 11
        Pelvis = 12
        Fallopian Tube = 13
        Brain = 14
        Mesentery = 15
        Duodenum = 16
        Small Bowel = 17
        Psoas = 18
        Cervix = 19
        Coloanal Anastamosis = 20
        Adrenal = 21
        Abdominal = 22
        Spleen = 23
        Chest Wall = 24
        Pancreas = 25
        Pleura = 26
        Uterus = 27
        Sigmoid Colon = 28
        Bladder = 29
        Mesentry = 30
        Adnexa = 31
        Jejunum = 32
        Ureter = 33
        Vagina = 34
        Umbilical Hernia Sac = 35
        Stomach = 36
        Rectum = 37
        Kidney = 38
        mCRC Metastasis = 39
        mCRC Primary = 40
        Early Stage Primary = 41
        Suboptimal Debulking = 42
        Rfa-1 = 43
        Lns = 44
        Ablation = 45
        Ln = 46
        Ln - Rt = 47
        Local Recurrence = 48
        Scheduled = 49
        Debulking = 50
        Rfa - 2 = 51
        Rp Mass = 52
        Abdomen = 53
        Lymph Node = 54
        Peritoneal Fluid = 55
        Paracolic Gutter = 56
        RetroPeritoneum = 57
        Peritoneal Implant = 58
        Spine = 59
        Diaphragm = 60
        Paraspinal Mass = 61
        Cerebellum = 62
        Sacral Mass = 63
        Skull base = 64
        MSS = 65
        MSI = 66
        Inconclusive = 67
        Mod_Diff = 68
        Mod-Poorly-Diff = 69
        Poorly-Diff = 70
        Cecum = 71
        Ascending Colon = 72
        Transverse Colon = 73
        Rectosigmoid = 74
        Descending Colon = 75
        Splenic Flexure = 76
        Hepatic Flexure = 77
        Colon = 78
        Left = 79
        Right = 80
        Metastasis = 81
        Primary = 82
        Female = 83
        Male = 84
        Resection = 85
        Biopsy = 86
        RetroPeritoneum = 87
```